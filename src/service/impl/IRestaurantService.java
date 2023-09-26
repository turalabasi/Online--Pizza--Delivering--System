package service.impl;

import helper.ServiceHelper;
import model.Courier;
import model.Customer;
import model.Order;
import service.RestaurantService;
import util.InputUtil;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static data.GlobalData.*;

public class IRestaurantService implements RestaurantService {
    @Override
    public void addCourier() {int count = InputUtil.getInstance().inputInt("Enter count to register : ");
        for (int i = 0; i < count; i++) {
            Courier courier = ServiceHelper.fillCourier();
            if (courier != null) {
                courierList.add(courier);
            }

        }
        }

    @Override
    public void trackOrders() {
        int orderId = InputUtil.getInstance().inputInt("Enter the order ID: ");
        LocalDateTime currentDateTime = LocalDateTime.now();


        for (Order order : orderList) {
            if (order.getOrderId() == orderId) {
                LocalDateTime startTime = order.getStartTime();
                LocalDateTime deliveryTime = order.getDeliveryTime();
                Duration duration = Duration.between(startTime, deliveryTime);



               long minutes = duration.toMinutes() ;


                System.out.println(minutes + " minutes, " );

                for (Courier courier : courierList) {
                    if (currentDateTime.isAfter(startTime) && currentDateTime.isBefore(deliveryTime)) {

                        courier.setAvailabilityStatus((byte) -1);
                    } else if (currentDateTime.isAfter(deliveryTime)) {

                        courier.setAvailabilityStatus((byte) 1);
                        order.setDeliveryStatus((byte) 1);
                    }
                }

            }
        }
    }



    @Override
    public void viewCouriers() {
        for (Courier courier : courierList){
            System.out.println(courier);
        }

    }

    @Override
    public void viewCustomers() {
        for (Customer customer : customerList){
            System.out.println(customer);
        }

    }
}

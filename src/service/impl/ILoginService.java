package service.impl;

import enums.Pizza;
import enums.PizzaSize;
import enums.Sous;
import helper.ServiceHelper;
import model.Courier;
import model.Order;
import service.LoginService;
import service.PaymentManagement;
import service.PaymentService;
import util.InputUtil;
import util.MenuUtil;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

import static data.GlobalData.courierList;
import static data.GlobalData.orderList;

public class ILoginService implements LoginService {
    @Override
    public void placeOrder() {
        Order order = ServiceHelper.fillOrder();
             orderList.add(order);
        PaymentManagement paymentManagement = new IPaymentManagement();
        paymentManagement.management();

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


                System.out.println( minutes);

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
    public void cancelOrder() {
        long id = InputUtil.getInstance().inputLong("enter id : ");
        for (Order order : orderList){
            if (id == order.getOrderId()){
                orderList.remove(order);

            }
        }


    }
}

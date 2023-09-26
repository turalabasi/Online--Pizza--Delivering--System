package service.impl;

import data.GlobalData;
import model.Customer;
import model.Order;
import service.PaymentService;

public class IPaymentService implements PaymentService {
    @Override
    public void makeThePayments() {
        for (Customer customer : GlobalData.customerList){
            for (Order order : GlobalData.orderList){
                if (customer.getMoneyAccount() > order.getPrice()){
                    customer.setMoneyAccount(customer.getMoneyAccount() - order.getPrice());


            }
        }


    }

    }
}

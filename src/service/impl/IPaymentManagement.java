package service.impl;

import service.*;
import util.MenuUtil;

import java.util.InputMismatchException;

public class IPaymentManagement implements PaymentManagement {

    @Override
    public void management() {
        int option = MenuUtil.getInstance().paymentMenu();
        while (true) {
            try {

                PaymentService paymentService = new IPaymentService();
               LoginService loginService= new ILoginService();

                switch (option) {
                    case 1:
                        paymentService.makeThePayments();
                        break;
                    case 2:
                        loginService.cancelOrder();
                        break;
                    default:
                        throw new RuntimeException();
                }
            } catch (
                    InputMismatchException | NumberFormatException e) {
                System.err.println(e.getMessage());

            }


        }
    }}

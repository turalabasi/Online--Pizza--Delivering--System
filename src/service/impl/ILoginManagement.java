package service.impl;

import data.GlobalData;
import model.Customer;
import service.CustomerManagement;
import service.CustomerService;
import service.LoginManagement;
import service.LoginService;
import util.InputUtil;
import util.MenuUtil;

import java.util.InputMismatchException;

public class ILoginManagement implements LoginManagement {
    @Override
    public void management() {
        String email = InputUtil.getInstance().inputString("enter the mail : ");
        String password = InputUtil.getInstance().inputString("enter the password : ");

        for (Customer customer : GlobalData.customerList) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)){
                while (true){

                    try {
                        int option = MenuUtil.getInstance().loginMenu();
                        LoginService loginService = new ILoginService();
                        CustomerManagement customerManagement = new ICustomerManagement();

                        switch (option) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                customerManagement.management();
                                break;
                            case 2:
                                loginService.placeOrder();
                                break;
                            case 3:
                                loginService.trackOrders();
                                break;
                            case 4:
                                loginService.cancelOrder();
                                break;
                            default:
                                throw new RuntimeException();
                        }
                    } catch (
                            InputMismatchException |  NumberFormatException e){
                        System.err.println(e.getMessage());

                    }

                }

            }
        }
    }

    }


package service.impl;

import data.GlobalData;
import model.Customer;
import service.*;
import util.InputUtil;
import util.MenuUtil;

import java.util.InputMismatchException;

public class ICustomerManagement implements CustomerManagement {

    @Override
    public void management() {

                while (true){

                    try {
                        int option = MenuUtil.getInstance().customerMenu();

                        CustomerService customerService = new ICustomerService();
                        ProjectManagement projectManagement = new IProjectManagement();
                        LoginService loginService =new ILoginService();
                        LoginManagement loginManagement = new ILoginManagement();
                        switch (option) {
                            case 0:
                                System.exit(0);
                                break;
                            case 1:
                                loginManagement.management();
                                break;
                            case 2:
                                customerService.signUp();
                                break;
                            case 3:
                                projectManagement.management();
                                break;
                            default:
                                throw new RuntimeException();
                        }
                    } catch (
                            InputMismatchException  | NumberFormatException e){
                        System.err.println(e.getMessage());

                    }

                }
            }
        }




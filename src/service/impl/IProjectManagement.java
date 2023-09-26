package service.impl;

import service.*;
import util.MenuUtil;

import java.util.InputMismatchException;

public class IProjectManagement implements ProjectManagement {
    @Override
    public void management() {
        while (true){

            try {
                int option = MenuUtil.getInstance().mainMenu();
                CustomerService customerService = new ICustomerService();
                AdminService adminService = new IAdminService();
                CustomerManagement customerManagement = new ICustomerManagement();

                switch (option) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        adminService.adminLogin();
                        break;
                    case 2:
                        customerManagement.management();
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


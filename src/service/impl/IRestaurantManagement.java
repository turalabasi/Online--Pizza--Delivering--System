package service.impl;

import service.*;
import util.MenuUtil;

import java.util.InputMismatchException;

public class IRestaurantManagement implements service.RestaurantManagement {

    @Override
    public void management() {
        while (true){

            try {
                int option = MenuUtil.getInstance().adminMenu();

                CustomerService customerService = new ICustomerService();
                AdminService adminService = new IAdminService();
                RestaurantManagement restaurantManagement = new IRestaurantManagement();
                RestaurantService restaurantService = new IRestaurantService();
                ProjectManagement projectManagement = new IProjectManagement();


                switch (option) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                      projectManagement.management();
                        break;
                    case 2:
                        restaurantService.addCourier();
                        break;
                    case 3:
                        restaurantService.trackOrders();
                        break;
                    case 4:
                        restaurantService.viewCouriers();
                        break;
                    case 5:
                        restaurantService.viewCustomers();
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



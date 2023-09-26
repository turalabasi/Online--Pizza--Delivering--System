package service.impl;

import service.AdminService;
import service.RestaurantManagement;
import service.RestaurantService;
import util.InputUtil;

public class IAdminService implements AdminService {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password";

    @Override
    public void adminLogin() {
        String username = InputUtil.getInstance().inputString("enter the username : ");
        String password = InputUtil.getInstance().inputString("enter the password : ");


        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            RestaurantManagement restaurantManagement = new IRestaurantManagement();
            restaurantManagement.management();
            }

         else {
            System.out.println("Login failed. Incorrect username or password.");

        }
    }
}

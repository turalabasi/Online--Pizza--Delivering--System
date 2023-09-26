package service.impl;

import helper.ServiceHelper;
import model.Customer;
import service.CustomerService;
import util.InputUtil;


import static data.GlobalData.customerList;

public class ICustomerService implements CustomerService {


    @Override
    public void signUp() {
        int count = InputUtil.getInstance().inputInt("Enter count to register : ");
        for (int i = 0; i < count; i++) {
            Customer customer = ServiceHelper.fillCustomer();
            if (customer != null){
                customerList.add(customer);
            }

        }

    }
}

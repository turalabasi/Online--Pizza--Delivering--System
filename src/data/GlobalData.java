package data;

import model.Courier;
import model.Customer;
import model.Order;
import model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Order> orderList = new ArrayList<>();
    public static List<Courier> courierList = new ArrayList<>();

    public static Restaurant restoran = new Restaurant("La Cena ", "Milano,Como 13", 9000000, null);


}
package helper;

import data.GlobalData;
import enums.Pizza;
import enums.PizzaSize;
import enums.Sous;
import model.Courier;
import model.Customer;
import model.Order;
import model.Restaurant;
import util.InputUtil;

import java.time.LocalDateTime;
import java.util.List;


public class ServiceHelper {
    static long courierId = 0;
    static long restaurantId = 0;
    static long customerId = 0;
    static long orderId = 0;

    public static Customer fillCustomer() {
        String name = InputUtil.getInstance().inputString("enter the customer name : ");
        String surname = InputUtil.getInstance().inputString("enter the surname : ");
        String phoneNumber = InputUtil.getInstance().inputString("Enter the customer phoneNumber : ");
        String email = InputUtil.getInstance().inputString("Enter the customer email : ");
        String password = InputUtil.getInstance().inputString("Enter the customer password : ");
        LocalDateTime registerDate = LocalDateTime.now();


        return new Customer(++customerId, name, surname, phoneNumber, email, password, 3800.0, registerDate, orderId, (byte) 0);

    }

    public static void fillRestaurant(Order order) {

        GlobalData.restoran.getOrderList().add(order);

    }

    public static Order fillOrder() {
        double totalCost = 0.0;


        System.out.println("----------| Enter your pizza choice |-----------");
        for (Pizza pizza : Pizza.values()) {
            System.out.println("[" + (pizza.ordinal() + 1) + "] -> " + pizza + " -> $" + pizza.getPrice());
        }

        int pizzaName = InputUtil.getInstance().inputInt("enter choice");
        Pizza selectedPizza = Pizza.values()[pizzaName - 1];

        System.out.println("\n---------| Pizza Size |-------------");
        for (PizzaSize size : PizzaSize.values()) {
            System.out.println("[" + (size.ordinal() + 1) + "] -> " + size.getName() + " (+" + size.getPrice() + " USD)");
        }
        int pizzaSize = InputUtil.getInstance().inputInt("enter choice");
        PizzaSize selectedSize = PizzaSize.values()[pizzaSize - 1];

        System.out.println("\n ------------| Sauce |-------------");
        for (Sous sous : Sous.values()) {
            System.out.println("[" + (sous.ordinal() + 1) + "] -> " + sous.getName() + " -> $" + sous.getPrice());
        }

        int sous = InputUtil.getInstance().inputInt("enter choice");
        Sous selectedSauce = Sous.values()[sous - 1];


        double price = selectedPizza.getPrice() + selectedSize.getPrice() + selectedSauce.getPrice();
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime deliveryTime = LocalDateTime.now().plusHours(1);


        return new Order(++orderId, pizzaName, pizzaSize, sous, price, startTime, deliveryTime, customerId, courierId, (byte) 0);
    }

    public static Courier fillCourier() {
        String name = InputUtil.getInstance().inputString("enter the courier name");
        String phoneNumber = InputUtil.getInstance().inputString("enter the phoneNmuber : ");
        String vehicleType = InputUtil.getInstance().inputString("vehicle type : ");
        String vehiclePlate = InputUtil.getInstance().inputString("vehicle plate : ");


        return new Courier(++courierId, name, phoneNumber, vehicleType, vehiclePlate, customerId, orderId, (byte) 0);
    }
}
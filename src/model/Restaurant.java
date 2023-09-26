package model;

import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    private  double totalAmount;
    private List<Order> orderList ;

    public Restaurant(String name, String location, double totalAmount, List<Order> orderList) {
        this.name = name;
        this.location = location;
        this.totalAmount = totalAmount;
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalAmount=" + totalAmount +
                ", orderList=" + orderList +
                '}';
    }
}

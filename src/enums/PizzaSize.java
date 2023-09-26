package enums;

public enum PizzaSize {
    Small("Small",4.99) ,
   Medium("Medium",6.99) ,
    Large("Large",13.99);


    PizzaSize(String name, Double price) {
        this.name = name;
        this.price = price;
    }


    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

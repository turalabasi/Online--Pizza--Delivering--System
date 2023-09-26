package enums;

public enum Pizza {
    ITALIANO("Italiano",11.99) ,
    AMERICANO("Americano",10.99) ,
    MEXICANO("Mexicano",12.99) ,
    CHICKEN_KICKERS("Chicken Kickers",9.99) ,
    MARGHERITA ("Margherita",13.99),
    PEPPERONI("Pepperoni",14.99);


    Pizza(String name, Double price) {
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

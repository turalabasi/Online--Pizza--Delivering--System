package enums;

public enum Sous {
    Ketchup("ketchup",0.7) ,
    BARBECU("barbecu",0.7) ,
    Mayonnaise("mayonnaise",0.7);


    Sous(String name, Double price) {
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

package com.healthedge;

public class Toy implements Comparable<Toy>{
    private String toyName;
    private Integer price;
    private int quantity;

    public Toy() {
    }


    public Toy(String toyName, int price, int quantity) {
        this.toyName = toyName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Toy toy) {
        return this.price.compareTo(toy.getPrice());
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyName='" + toyName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

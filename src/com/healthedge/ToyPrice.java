package com.healthedge;

public enum ToyPrice {

    A("A", 5),
    B("B", 1),
    C("C", 3),
    D("D", 2),
    E("E", 8);


    private final String name;
    private final Integer price;

    private ToyPrice(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}

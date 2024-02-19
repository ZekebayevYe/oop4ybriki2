package com.example.oopaer.models;

public class Ticket {
    private static int id_gen=1;
    private String name;
    private int price;
    private int id = id_gen++;

    public Ticket(){
        this.id = id_gen++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String ToString() {
        return id + ". " + "Name of ticket: " + name + " price of ticket: " + price;
    }
}
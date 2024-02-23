package com.example.oopaer.models;

@Getter
@Setter

public class Ticket {
    private static int id_gen=1;
    private String name;
    private int price;
    private int id = id_gen++;



    public String ToString() {
        return id + ". " + "Name of ticket: " + name + " price of ticket: " + price;
    }
}
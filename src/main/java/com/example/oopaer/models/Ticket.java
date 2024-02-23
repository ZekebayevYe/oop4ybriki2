package com.example.oopaer.models;

@NoArgsConstructor
@Setter
@Getter
@ToString

public class Ticket {
    private static int id_gen=1;
    private String name;
    private int price;
    private int id = id_gen++;



    public String ToString() {
        return id + ". " + "Name of ticket: " + name + " price of ticket: " + price;
    }
}
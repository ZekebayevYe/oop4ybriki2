public class Ticket {
    private int id_gen;
    private String name;
    private int price;
    private static int id = id_gen++;

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static void setId(int id) {
        Ticket.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String ToString {
        return id + ". " + "Name of ticket: " + name + " price of ticket: " + price;
    }
}


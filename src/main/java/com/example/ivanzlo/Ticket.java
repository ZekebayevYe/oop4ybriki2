import package ivanzolo;



public class Ticket {
    private static int id_gen;
    private String name;
    private int id = id_gen++;
    private int price;


    public getId() {

        return this.id;
    }

    public getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id_gen++;
    }
    public Ticket(String name, int price) {
        this.name = name;
        this.price = price;
    }
}




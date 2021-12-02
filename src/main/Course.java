package main;

public class Course {
    public String name;
    public int id;
    private int price;

    public Course(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.setPrice(price);
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount Should be >= 0");
        this.price = amount;
    }
}

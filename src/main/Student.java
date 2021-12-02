package main;

public class Student {
    public String name;
    public int id;
    private int paymentAmount;
    
    public Student(String name, int id, int paymentAmount) {
        this.name = name;
        this.id = id;
        this.setPaymentAmount(paymentAmount);
    }

    public void register(Course course) {
        this.setPaymentAmount(this.getPaymentAmount() + course.getPrice());
    }

    public void setPaymentAmount(int newAmount) {
        if (newAmount < 0) throw new IllegalArgumentException("PaymentAmount Should be >= 0");
        this.paymentAmount = newAmount;
    }

    public int getPaymentAmount() {
        return this.paymentAmount;
    }
}

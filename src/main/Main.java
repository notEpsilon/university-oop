/**
 * author: Ibrahim Amin (201901434)
*/
package main;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Modern Physics", 123, 100);
        Course c2 = new Course("Numerical Analysis", 101, 400);

        Student s1 = new Student("Khaled", 201901, 0);
        Student s2 = new Student("Mohamed", 201904, 0);

        s1.register(c1);
        s1.register(c2);

        s2.register(c1);
        s2.register(c2);

        System.out.println("\nStudent1 PaymentAmount: " + s1.getPaymentAmount());
        System.out.println("Student2 PaymentAmount: " + s2.getPaymentAmount());
    }
}

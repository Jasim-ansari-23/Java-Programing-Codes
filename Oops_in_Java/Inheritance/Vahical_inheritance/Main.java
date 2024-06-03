package Oops_in_Java.Inheritance.Vahical_inheritance;

public class Main {
    public static void main(String[] args) {
        Car c = new Car("Maruti", "800", 4, 5, "Automatic");
        c.enginestarted();
        c.startAc();
        c.enginestop();
        System.out.println("<-- Bike -->");
        Motorcycle bike = new Motorcycle("Splender", "560", 2, "U", "soft");
        bike.enginestarted();
        bike.wheelee();
        bike.enginestop();
    }
}

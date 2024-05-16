package Oops_in_Java.Advance_Oops;

import java.util.Objects;

public class Object_Class {
    public static void main(String[] args) {
        Car c = new Car("Honda", 2022);
        Car c2 = new Car("Honda", 2022);
        System.out.println(c.equals(c2)); // Both are equals
        System.out.println(c.hashcode()); // It'll generate then same hashcode coz both are equals
        System.out.println(c2.hashcode());
    }
}

class Car{
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Checking that both objects are equals or not
    public boolean equals(Object obj){
        Car that = (Car)obj;
        return this.model.equals(that.model) && this.year == that.year;
    }

    // Hashcode in Java is an integer value that uniquely (ideally) identifies an object for faster lookups in collections.
    public int hashcode(){
        return Objects.hash(model, year);
    }
}
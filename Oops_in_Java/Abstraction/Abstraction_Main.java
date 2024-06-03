package Oops_in_Java.Abstraction;

// Abstract can't be instantiated, means can't be created as an object
abstract class Bird{
    abstract void fly();
    abstract void eat();
    // Now create concrete method, meaning to say its behaviour inside the Abstract class & it's not mandatory to use
    // its subclasses
    public void sleep(){
        System.out.println("Bird is sleeping");
    }
} // It can only use through it's subclass

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eating");
    }
}

class crow extends Bird{
    @Override
    void fly() {
        System.out.println("Crow is flying");
    }

    @Override
    void eat() {
        System.out.println("Crow is eating");
    }
}

public class Abstraction_Main {
    // Let's do using upcasting
    public static void doBirdstuff(Bird b){
        b.eat();
        b.fly();
        b.sleep();
    }
    
    public static void main(String[] args) {
//        Bird b = new Sparrow();
//        b.eat();
//        b.fly();
        doBirdstuff(new crow());
        doBirdstuff(new Sparrow());
    }
}

// Note:- Abstract was used in java previously, but has been replaced by (Interfaces)-(Implements).
// Note:- Interfaces can inherit multiple interface classes, however abstract can't
package Oops_in_Java.Polymorphism;

public class Method_Overriding {
    public static void main(String[] args) {
//        Shape shape = new Circle(); // Superclass calls the relevant subclass
//        shape.shape();
        Circle c = new Circle();
//        c.shape();
//        Dodrawing(new Shape()); // it'll call the Superclass Shape method
        Dodrawing(c); // It'll call the Subclass Circle's method
    }

    // it's called upcasting
    public static void Dodrawing(Shape s){
        s.shape(); // Polymorphic
    }
}

class Shape{
    public void shape(){
        System.out.println("Generic shape drawing...");
    }
}

class Circle extends Shape{
    @Override
    public void shape(){
        System.out.println("It's drawing in Circle shape");
    }
}

// It's called (Run time polymorphism), where its decide which one method should I call while run time
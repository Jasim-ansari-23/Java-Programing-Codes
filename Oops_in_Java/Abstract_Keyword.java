package Oops_in_Java;

public class Abstract_Keyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Dog d = new Dog();
        d.eat();
        d.walk();
    }

    static abstract class Animal {
        void eat() {
            System.out.println("Every animal eats, but different foods");
        }

        abstract void walk();
    }

    static class Horse extends Animal {
        void walk() {
            System.out.println("Horse walk on 4 legs");
        }
    }

    static class Dog extends Animal {
        void walk() {
            System.out.println("Dogs walk on 2 legs");
        }
    }
}



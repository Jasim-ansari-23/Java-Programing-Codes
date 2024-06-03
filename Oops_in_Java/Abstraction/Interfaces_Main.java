package Oops_in_Java.Abstraction;

public class Interfaces_Main {
    public static void DoAAnimalStuff(Animal a){
        a.run();
        a.eat();
        a.sleep();
    }

    public static void Dopower(Power p){
        p.power();
    }

    public static void main(String[] args) {
//        Animal a = new Deer();
//        a.eat();
//        a.run();
        DoAAnimalStuff(new Deer());
        Dopower(new Deer());
        DoAAnimalStuff(new Tiger());
        Dopower(new Tiger());
    }
}

interface Animal {
    void run();
    void eat();

    // Now create concrete method using default, meaning to say its behaviour inside the Abstract class & it's not
    // mandatory to use its subclasses
    default void sleep(){
        System.out.println("Animal is sleeping");
    }
}

interface Power{
    void power();
}

class Deer implements Animal, Power{
    @Override
    public void run() {
        System.out.println("Deer run with 4 legs");
    }

    @Override
    public void eat() {
        System.out.println("Deer eats grass");
    }

    @Override
    public void power() {
        System.out.println("Deer doesn't has special ability");
    }
}

class Tiger implements Animal, Power{
    @Override
    public void run() {
        System.out.println("Tiger run faster than Deer with all 4 legs");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats deer");
    }

    @Override
    public void power() {
        System.out.println("Tiger has special ability to kill any animal");
    }
}

// Note:- Interfaces can inherit multiple interface classes, however abstract can't
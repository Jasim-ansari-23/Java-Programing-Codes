package Oops_in_Java.Polymorphism;

public class Method_Overloading {
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,6));
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,4.2,6.5));
    }
}

class calculator{
    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public double add(int a, int b, double c, double d){
        return a+b+c+d;
    }
}

// Polymorphism -> “poly” means many and “morphs” means forms, So it means many forms. (One person different
// behaviour )
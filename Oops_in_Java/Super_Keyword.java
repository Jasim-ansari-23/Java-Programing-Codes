package Oops_in_Java;

public class Super_Keyword {
    public static void main(String args[]) {
        new Horse();
    }

    static class Animal{
        Animal(){
            System.out.println("Animal constructor called");
        }
    }
    
    static class Horse extends Animal{
        Horse(){
            super();
            System.out.println();
        }
    }
}

// If you use (super()) keyword, it'll refer parent class
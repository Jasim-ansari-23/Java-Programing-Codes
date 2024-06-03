package Oops_in_Java;

public class Constructor_Chaining {
    public static void main(String args[]) {
        new Result();
    }

    static class Plus{
        Plus(){
            System.out.println("This is the Main class Constructor");
        }
    }
    static class Result extends Plus{
        Result(){
            this(12, 15);
        }
        Result(int a, int b){
            System.out.println(a*b);
        }
    }
}

// Constructor chaining in simple terms is a process in object-oriented programming where one constructor calls another constructor within the same class or in its superclass.

// Constructor chaining occurs when one constructor calls another constructor to perform some or all of the initialization work.
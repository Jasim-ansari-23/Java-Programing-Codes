package Oops_in_Java;

public class Method_Overiding {
    public static void main(String[] args){
        A_class a = new A_class();
        a.eat();
        B_class b = new B_class();
        b.eat();
    }

    static class A_class{
        void eat(){
            System.out.println("Eat -> This represent Class A Method");
        }
    }
    static class B_class extends A_class{
        void eat(){
            System.out.println("Eat -> This represent Class B Method");
        }
    }
}

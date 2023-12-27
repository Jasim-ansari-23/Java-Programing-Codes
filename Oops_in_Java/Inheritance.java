package Oops_in_Java;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }

    static class Animal{
        String color;

        void eat(){
            System.out.println("Eats");
        }

        void breath(){
            System.out.println("Breaths");
        }
    }

    static class Fish extends Animal{
        int fins;

        void swim(){
            System.out.println("Swims");
        }
    }
}

// Single level inheritance 

// public class Inheritance {

//     public static void main(String[] args) {
//         two t = new two();
//         t.printFirst();
//         t.printFirst2nd();
//         t.printSecond();
//     }

//     static class first{
//         void printFirst(){
//             System.out.print("Mohammad ");
//         }

//         void printFirst2nd(){
//             System.out.print("Jasim ");
//         }
//     }

//     static class two extends first{
//         void printSecond() {
//             System.out.print("Ansari");
//         }
//     }
// }

// Multi level inheritance

// public class Main {

//     public static void main(String[] args) {
//         three t = new three();
//         t.printFirst();
//         t.printSecond();
//         t.printThree();
//     }

//     static class first{
//         void printFirst(){
//             System.out.print("Mohammad ");
//         }
//     }

//     static class two extends first{

//         void printSecond() {
//             System.out.print("Jasim ");
//         }
//     }

//     static class three extends two{
//         void printThree(){
//             System.out.print("Ansari");
//         }
//     }
// }

// Hierarchical  inheritance
 
// class A {
//     public void print_A() { System.out.println("Class A"); }
// }
 
// class B extends A {
//     public void print_B() { System.out.println("Class B"); }
// }
 
// class C extends A {
//     public void print_C() { System.out.println("Class C"); }
// }
 
// class D extends A {
//     public void print_D() { System.out.println("Class D"); }
// }

// public class Test {
//     public static void main(String[] args)
//     {
//         B obj_B = new B();
//         obj_B.print_A();
//         obj_B.print_B();
 
//         C obj_C = new C();
//         obj_C.print_A();
//         obj_C.print_C();
 
//         D obj_D = new D();
//         obj_D.print_A();
//         obj_D.print_D();
//     }
// }

// Hybrid Inheritance

// public class Main {

//     public static void main(String[] args){
//         LocalCompany lc = new LocalCompany();
//         lc.getBase();
//         SharedCompany sc = new SharedCompany();
//         sc.getBase();
//     }

//     static class BaseCompany{
//         void getBase(){
//             System.out.println("This is the base company");
//         }
//     }

//     static class ChildCompany extends BaseCompany{
//     }

//     static class LocalCompany extends ChildCompany{
//     }

//     static class SharedCompany extends BaseCompany{
//     }
// }

// What does means of inheritance?
// Ans - Inheritance in simple language is a concept in programming that allows a new class (called the "subclass" or "child class") to inherit properties and behaviors from an existing class using (extends) utility function and it's (called the "superclass" or "parent class"). It's like a child inheriting traits from their parents.
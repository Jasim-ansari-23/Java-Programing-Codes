package Oops_in_Java;

public class Polymorphism {
    public static void main(String[] args){
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2, 5));
        System.out.println(cal.sum((float)2.4, (float)5.4));
        System.out.println(cal.sum(2, 5, 66));
    }

    static class Calculator{
        int sum(int a, int b){
            return a + b;
        }

        float sum(float a, float b){
            return a + b;
        }

        int sum(int a, int b, int c){
            return a + b + c;
        }
    }
}
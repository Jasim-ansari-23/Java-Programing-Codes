package Methodes_Codes;

import java.util.Scanner;
public class overloading_sum {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(3,5));
        System.out.println(sum(8,1,1));
        sc.close();
    }
}
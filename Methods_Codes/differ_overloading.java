package Methods_Codes;

import java.util.Scanner;

public class differ_overloading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b, float c){
        return a+b+c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(3,5));
        System.out.println(sum(3.0f,5.0f,2.1f));
        sc.close();
    }
}
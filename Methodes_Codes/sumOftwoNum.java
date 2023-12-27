package Methodes_Codes;

import java.util.Scanner;

public class sumOftwoNum {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter the 1st value: ");
        a = sc.nextInt();
        System.out.print("Enter the 2nd value: ");
        b = sc.nextInt();

        int c = sum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + c);
        sc.close();
    }
}
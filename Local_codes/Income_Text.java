

import java.util.Scanner;

public class Income_Text {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float income;
        System.out.println("Enter your income: ");
        income = sc.nextFloat();
        if (income >= 1 && income <= 5) {
            System.out.println("Your income is (" + income + "), you don't have to pay tax");
        } else if (income >= 5 && income <= 10) {
            System.out.println("Your income is (" + income + "), so have to pay tax 20% of your income");
        } else if (income >= 10) {
            System.out.println("Your income is (" + income + "), so have to pay tax 30% of your income");
        }
        sc.close();
    }
}
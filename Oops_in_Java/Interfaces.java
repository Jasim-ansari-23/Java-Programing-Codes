package Oops_in_Java;

import java.util.Scanner;

public class Interfaces {
    public static void main(String[] args) {
        developer d = new developer();
        d.table();
    }

    interface Client {
        void table();
    }

    static class developer implements Client {
        public void table() {
            try (Scanner sc = new Scanner(System.in)) {
                int table, i;
                System.out.print("Enter the number: ");
                table = sc.nextInt();
                for (i = 1; i <= 10; i++) {
                    System.out.println(table + "*" + i + " = " + (table * i));
                }
            }
        }
    }
}

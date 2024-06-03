package Array_Codes;

import java.util.Scanner;

public class BinaryTodecimal {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, binaryLength - 1 - i);
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        scanner.close();

        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal equivalent: " + decimal);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        String type = (num % 2 == 0) ? "Even number" : "Odd number";
        System.out.println(type);
        sc.close();
    }
}
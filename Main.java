import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("How many subjects do you have: ");
        num = sc.nextInt();

        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            System.out.println("Marks of subject " + (i + 1) + ": " + arr[i]);
        }
        sc.close();
    }
}
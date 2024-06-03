package Array_Codes;
import java.util.Scanner;

public class Arrayo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter the element of "+ i +" index: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
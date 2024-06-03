package Methods_Codes;

import java.util.Scanner;

public class check_evenOdd {
    public static void evenOdd(int num){
    if(num%2 == 0){
        System.out.println(num + ": is even number");
    }
    else{
        System.out.println(num + ": is odd number");
    }
}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        evenOdd(num); 
        sc.close();
    }
}
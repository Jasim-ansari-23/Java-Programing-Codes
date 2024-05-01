package Recursion;
import java.util.Scanner;

public class Get_Fibonacci {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int ans = fib(n-1)+fib(n-2);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the num: ");
        n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
        sc.close();
    }
}
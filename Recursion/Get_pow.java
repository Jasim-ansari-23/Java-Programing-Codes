package Recursion;
import java.util.Scanner;

public class Get_pow {
    public static int pow(int n){
        if(n == 0){
            return 1;
        }
        int ans = 2 * pow(n-1);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the num: ");
        n = sc.nextInt();
        int ans = pow(n);
        System.out.println(ans);
        sc.close();
    }
}
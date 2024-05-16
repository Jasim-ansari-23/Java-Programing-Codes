package Recursion;
import java.util.*;

public class Sum_natural_num {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int ans = n + sum(n-1);
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the num: ");
        n = sc.nextInt();
        int ans = sum(n);
        System.out.println(ans);
        sc.close();
    }
}

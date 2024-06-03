package Leet_Codes_Questions;

public class ClimbStairs {
    public static int stairs(int n){
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        int ans = stairs(n-1)+stairs(n-2);
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 5;
        int ans = stairs(n);
        System.out.println(ans);
    }
}
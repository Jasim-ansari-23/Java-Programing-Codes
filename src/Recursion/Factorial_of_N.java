package Recursion;

public class Factorial_of_N {
    public static long Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * Factorial(n-1);
    }
    public static void main(String args[]){
        int n = 5;
        long fact = Factorial(n);
        System.out.println("Factorial of " + n + " = " + fact);
    }
}

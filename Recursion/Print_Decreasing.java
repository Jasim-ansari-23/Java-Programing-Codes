package Recursion;

public class Print_Decreasing {
    public static void printDec(int n){
        if(n == 1){ // this is a base class, where recursion will stop
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        printDec(n);
    }
}
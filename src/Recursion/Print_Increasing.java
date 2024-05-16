package Recursion;

public class Print_Increasing {
    public static void printInc(int n){
        if(n == 1){ // this is a base class, where recursion will stop
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static void main(String args[]){
        int n = 10;
        printInc(n);
    }
}

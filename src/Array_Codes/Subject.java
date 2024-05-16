package Array_Codes;

import java.util.Scanner;

public class Subject {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sub[] = {"Mathu", "Science", "Hindi"};
        for(int i = 0; i<3; i++){
            System.out.print("Enter the "+ sub[i] + " marks: ");
            sub[i] = sc.next();
        }
        for(int i = 0; i<3; i++){
            System.out.print(sub[i] + " ");
        }
        sc.close();
    }
}
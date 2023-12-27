package Char_Array;

import java.util.Scanner;

public class Check_vowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char vowel;
        System.out.print("Enter the character: ");
        vowel = sc.next().charAt(0);
        if(vowel == 'a' && vowel == 'e' && vowel == 'i' && vowel == 'o' && vowel == 'u'){
            System.out.println(vowel + ": is vowel");
        }else{
            System.out.println(vowel + ": is consonant");
        }
        sc.close();
    }
}
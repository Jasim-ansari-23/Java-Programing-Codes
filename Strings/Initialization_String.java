package Strings;

import java.util.Scanner;

public class Initialization_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your full name: ");
        name = sc.nextLine(); //sc.nextLine() - is used for taking full input, instead of - sc.next();
        System.out.println("Your full name is: " + name); 

        //Check String length
        System.out.println("Your full name's length is: " + name.length());

        //Check which element is at which place
        System.out.println("The element looking for available at " + name.charAt(3)); 

        //Check index
        System.out.println(name.indexOf("Ans")); //index of character

        //Covert into lowercase and uppercase
        System.out.println(name.toLowerCase()); //for converting into LowerCase
        System.out.println(name.toUpperCase()); //for converting into UpperCase

        //Append the string 
        StringBuilder nameP = new StringBuilder("Jasim ");
        nameP.append("Ansari");
        System.out.println(nameP);

        //For concatenation
        String first = "Jasim", last = "Ansari";
        first = first.concat(last); // it'll concatenate the string in one line
        System.out.println(first);

        //Check whether the string exist or not, if exist true, otherwise false
        System.out.println(name.contains("Jasim")); //True
        System.out.println(name.contains("Jibrail")); //False

        //check if the string ends with particular string will return true otherwise false
        String nameo = "My full name is Jasim Ansari";
        System.out.println(nameo.endsWith("i")); //True
        System.out.println(nameo.endsWith("Ansari")); //True
        System.out.println(nameo.endsWith("Jasim")); //False

        //check two strings are equals, if qual then return true otherwise false
        String name1 = "Jasim";
        String name2 = "Jasim";
        String name3 = "Jibrail";

        System.out.println(name1.equals(name2)); //True if both are equals
        System.out.println(name1.equals(name3)); //False if both are not equals

        //Concatenate string using formate function
        String nameos = "Jasim";
        String s1 = String.format("My name is %s", nameos);
        System.out.println(s1);

        //Get bytes of each alphabets 
        String alpha = "ABCD";
        byte[] bar = alpha.getBytes();
        for(int i = 0; i<bar.length; i++){
            System.out.print(bar[i]+" ");
        }
        sc.close();
    }
}
package Strings;

public class Intern_Function {
    public static void main(String args[]) {
        // These data types stored in Stack 
        String str = "Jasim";
        String str1 = "Jasim";
        System.out.println(str == str1);
        
        String str4 = new String("Jasim"); //This data type are stored in heap which will gives false
        System.out.println(str4);

        // These data types stored in heap
        String str2 = new String("Jasim").intern();
        String str3 = new String("Jasim").intern(); //.intern(), will convert into same memory
        System.out.println(str2 == str3);
    }
}

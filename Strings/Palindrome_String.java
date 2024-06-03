package Strings;

public class Palindrome_String {
    public static boolean isPalindrome(String pal){
        for(int i = 0; i<pal.length(); i++){
            if(pal.charAt(i) != pal.charAt(pal.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        String pal = "noon"; 
        isPalindrome(pal);
        boolean palindrome = isPalindrome(pal);
        if(!palindrome){
            System.out.println(palindrome);

        }
        else{
            System.out.println(palindrome);
        }
    }
}
package Strings;

public class StringBuilder_And_Buffer{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        StringBuilder str = new StringBuilder();
        
        // get capacity
        System.out.println(sb.capacity()); //know the The capacity is the amount of storage available to insert new characters

        //check length
        System.out.println(sb.length());

        //reverse the string
        System.out.println(sb.reverse());

        str.append("GFG");
 
        // print string
        System.out.println("String = " + str.toString());
 
        // create a StringBuilder object
        // using StringBuilder(CharSequence) constructor
        StringBuilder str1 = new StringBuilder("AAAABBBCCCC");
 
        // print string
        System.out.println("String1 = " + str1.toString());
 
        // create a StringBuilder object
        // using StringBuilder(capacity) constructor
        StringBuilder str2 = new StringBuilder(10);
 
        // print string
        System.out.println("String2 capacity = " + str2.capacity());
 
        // create a StringBuilder object
        // using StringBuilder(String) constructor
        StringBuilder str3 = new StringBuilder(str1.toString());
 
        // print string
        System.out.println("String3 = " + str3.toString());

        //Insert something middle the string
        StringBuilder sbo = new StringBuilder("Mohammad Ansari");
        sb.insert(9, "Jasim ");
        System.out.println(sbo.toString());

        //StrintBuffer

        StringBuffer namu = new StringBuffer("Jasim");

        //Append something
        namu.append(" Ansari");

        //Insert something within the string
        namu.insert(0, "Mohhammad ");

        //Delete something within the string
        namu.delete(0, 10);

        //Get capacity of the string
        System.out.println(namu.capacity());

        //Print whatever you've done
        System.out.println(namu);

        //Utility functions are same for all class such as StringBuilder and StringBuffer
    }
}

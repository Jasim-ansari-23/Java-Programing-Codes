package Strings;

public class Substring_String {
    public static String subString(String str, int sIndex, int eIndex){
        String subStr = "";
        for(int i = sIndex; i<eIndex; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String args[]) {
        String name = "Jasim Ansari";
        System.out.println(subString(name, 0, 5));

        //inbuilt function for substring
        System.out.println(name.substring(0, 5));
    }
}
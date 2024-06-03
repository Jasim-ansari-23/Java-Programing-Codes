package Strings;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String name = "Jasim,Ansari";
        StringTokenizer st = new StringTokenizer(name,","); //it'll help you to break the code and remove something wherever you want
        
        while(st.hasMoreElements()){
            System.out.print(st.nextToken() + " ");
        }
    }
}
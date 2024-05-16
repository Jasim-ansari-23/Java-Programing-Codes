package Strings;

public class Concatenate {
    public static void main(String args[]) {
        String first = "Jasim", last = "Ansari", full_name = first + " " + last;
        System.out.println(full_name);
        first = first.concat(last); // it'll concatenate the string in one line
        System.out.println(first);
    }
}

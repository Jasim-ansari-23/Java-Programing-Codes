package Strings;

public class Campare {
    public static void main(String args[]) {
        String name[] = {"Jasim", "Jibrail", "Faizan"};
        String largest = name[0];
        for(int i = 0; i<name.length; i++){
            if(largest.compareToIgnoreCase(name[i]) < 0){
                largest = name[i];
            }
        }
        System.out.println(largest);
    }
}

package Strings;
import java.util.Scanner;

public class Strings_linearSearch {
    public static void searchPupil(String students[], String student){
        boolean found = false;
        for(int i = 0; i<students.length; i++){
            if(students[i].equals(student)){
                System.out.println(students[i] + ": is in the collage");
                found = true;
                break;
            };
            if(!found){
                System.out.println(students[i] + "not available");
            }
        }
    }

    public static void main(String args[]){
        String students[] = {"Jibrail", "Faizan", "Jasim", "Aakib", "Pari"}, student;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        student = sc.nextLine();
        searchPupil(students, student);
    }
}

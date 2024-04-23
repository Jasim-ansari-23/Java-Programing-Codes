package Strings;
import java.util.Scanner;

public class Strings_linearSearch {
    public static void searchPupil(String students[], String student){
        boolean found = false;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(student)){
                System.out.println(students[i] + ": currently studying here");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println(student + ": doesn't study here");
        }
    }

    public static void main(String args[]){
        String students[] = {"Jibrail", "Faizan", "Jasim", "Aakib", "Pari"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String student = sc.nextLine();
        searchPupil(students, student);
        sc.close();
    }
}
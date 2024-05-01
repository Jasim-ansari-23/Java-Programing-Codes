package Oops_in_Java.Encapsulation;

import java.util.*;

public class Getters_setters {
    public static void main(String[] args) {
        Student A = new Student();
        A.setName("Jasim");
        System.out.println(A.getName());
    }
}

class Student{
    private String name;

    // Getters --> We returns value in Getters, and it is used to print the value
    public String getName(){
        return name;
    }

    // Setters --> We used to refer to the current object & set the value 
    public void setName(String newName){
        this.name = newName;
    }
}

// These all are related to the Encapsulation
package Oops_in_Java;

public class begin_Oops {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setName("Jasim ansari");
        System.out.println("Student 1 name: " + s1.name);
        s1.setAge(21);
        System.out.println("Student 1 age: " + s1.age);
        s1.setMarks(81, 82, 80, 86, 83);
        System.out.println("Student 1 marks: " + s1.marks);
        s1.setCGPA(81, 82, 80, 86, 83);
        System.out.println("Student 1 cgpa: " + s1.cgpa);
    }
    static class Student{
        String name;
        int age;
        float marks;
        double cgpa;

        void setName(String newName){
            name = newName;
        }
        void setAge(int newAge){
            age = newAge;
        }
        void setMarks(float DBMS, float CORG, float CNUM, float CO, float DBMS_P){
            marks = (DBMS+CORG+CNUM+CO+DBMS_P)/5;
        }
        void setCGPA(double DBMS, double CORG, double CNUM, double CO, double DBMS_P){
            cgpa = (DBMS+CORG+CNUM+CO+DBMS_P)/5.0;
        }
    }
}

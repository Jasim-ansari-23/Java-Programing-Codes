package Oops_in_Java;

public class Setter_Getters {
    public class Main {
        public static void main(String[] args){
            Student s1 = new Student();
            s1.setName("Jasim ansari");
            System.out.println("Student 1 name: " + s1.name);
            s1.setMarks(81, 82, 80, 86, 83);
            System.out.println("Student 1 marks: " + s1.marks);
            s1.setCGPA(81, 82, 80, 86, 83);
            System.out.println("Student 1 cgpa: " + s1.cgpa);
        }
        static class Student{
            private String name;
            private int age;
            private float marks;
            private double cgpa;
    
            void setName(String newName){
                name = newName; //these are setters
            }
            int setAge(){
                return this.age; //it is a Getters
            }
            void setMarks(float DBMS, float CORG, float CNUM, float CO, float DBMS_P){
                this.marks = (DBMS+CORG+CNUM+CO+DBMS_P)/5; //these are setters
            }
            void setCGPA(double DBMS, double CORG, double CNUM, double CO, double DBMS_P){
                this.cgpa = (DBMS+CORG+CNUM+CO+DBMS_P)/5.0; //these are setters
            }
        }
    }
}

package Oops_in_Java;

public class Constructors {
    public static void main(String[] args){
        Student s1 = new Student("Jasim Ansari");
        System.out.println(s1.name);
    }
    static class Student{
        String name;
        int age;
        float marks;
        double cgpa;

        Student(String name){
            this.name = name;
        }
    }
}

//Another way -->

// public class Constructors {
//     public static void main(String[] args){
//         Student s1 = new Student("Jasim Ansari");   
//         System.out.println(s1.name);
//         Student s2 = new Student(21);
//         System.out.println(s2.age);
//         Student s3 = new Student(31.5f);
//         System.out.println(s3.roll);
//     }
//     static class Student{
//         String name;
//         int age;
//         float roll;

//         Student(String name){
//             this.name = name;
//         }

//         Student(int age){
//             this.age = age;
//         }

//         Student(float roll){
//             this.roll = roll;
//         }
//     }
// }
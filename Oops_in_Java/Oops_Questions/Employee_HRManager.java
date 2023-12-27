package Oops_in_Java.Oops_Questions;

public class Employee_HRManager {
    public static void main(String args[]){
        Employee emp = new Employee(80000);
        HRMaganer hr = new HRMaganer(100000);
        emp.work();
        System.out.println("Salary: "+ emp.getSalary());
        hr.work();
        System.out.println("Salary: "+ hr.getSalary());
    }
    static class Employee{
        private int salary;
        public Employee(int salary) {
            this.salary = salary;
        }
        public void work(){
            System.out.println("Working as a employee");
        }
        public int getSalary(){
            return salary;
        }
    }
    static class HRMaganer extends Employee {
        public HRMaganer(int salary){
            super(salary);
        }
        public void work(){
            System.out.println("Working as a HR Maganer");
        }
    }
}

// Another code ->

// static class Person {
//         private String firstName, lastName;

//         public Person(String firstName, String lastName) {
//             this.firstName = firstName;
//             this.lastName = lastName;
//         }
//         public String getFirstName() {
//             return firstName;
//         }
//         public String getLastName() {
//             return lastName;
//         }
//     }

//     static class Employee extends Person {
//         private int empID;
//         private String job;

//         public Employee(String firstName, String lastName, int empID, String job) {
//             super(firstName, lastName);
//             this.empID = empID;
//             this.job = job;
//         }
//         public int getEmpID() {
//             return empID;
//         }
//         public String getLastName() {
//             return super.getLastName() + ", Job Title: " + job;
//         }
//     }

//     public static void main(String args[]) {
//         Employee emp = new Employee("Jasim", " Ansari", 4514, "Hr Manager");
//         System.out.println("Full name: " + emp.getFirstName() + emp.getLastName() + ", Employee ID: " + emp.getEmpID());
//     }
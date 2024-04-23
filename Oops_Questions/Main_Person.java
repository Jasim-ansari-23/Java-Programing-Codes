package Oops_Questions;

public class Main_Person {
    public static void main(String[] args) {
        Employees e1 = new Employees("Jasim", "Ansari", 201, "Software Engineer");
        System.out.println(e1.getFirstName()+" "+e1.getLastName()+", "+e1.getEmpid());

        Employees e2 = new Employees("Jibrail", "Ansari", 202, "Software Developer");
        System.out.println(e2.getFirstName()+" "+ e2.getLastName()+", "+ e2.getEmpid());
    }
}

class Person{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}

class Employees extends Person{
    private int empid;
    private String job;

    public Employees(String firstName, String lastName, int empid, String job) {
        super(firstName, lastName);
        this.empid = empid;
        this.job = job;
    }

    public int getEmpid(){
        return empid;
    }

    @Override
    public String getLastName() {
            return super.getLastName() + ", " + job;
    }
}
package Oops_Questions;

public class Get_Salary {
    public static void main(String[] args) {
        Employee e = new Employee(40000);
        e.work();
        System.out.println("Employee salary: "+ e.getSalary());
        HrManager hr = new HrManager(80000);
        hr.work();
        hr.addEmp();
        System.out.println("HR Manager salary: "+ hr.getSalary());
    }
}

class Employee{
    private int salary;

    public Employee(int salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("Working as a employee");
    }

    public int getSalary(){
        return salary;
    }
}

class HrManager extends Employee{
    public HrManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("Working as a HR Manager");
    }

    public void addEmp(){
        System.out.println("Adding a employee");
    }
}
package Oops_in_Java.Inheritance.Types_Of_Inheritance;

public class Inheritance_Types {
    public static void main(String[] args) {
        // Single Inheritance
        Developer dev = new Developer("Faizan", 11, "Java");
        dev.show();

        System.out.println("It's Hr Time");

        // Multilevel Inheritance
        HR_Director hrDirector = new HR_Director("Aakib Ansari", 383);
        hrDirector.Handle_HrDuties();
        hrDirector.HrDirectorDuties();

        System.out.println("It's Ceo Time");

        // Hierarchical Inheritance
        // 1st
        Ceo ceo = new Ceo("Jibrail", 2);
        ceo.ceoDuty();

        // 2nd
        Company_Director director = new Company_Director("Jasim Ansari", 1);
        director.directorDuties();

        System.out.println("Its Team leading time");
        Teach_Lead teachLead = new Teach_Lead("Aakib", 203, "Projects X", 10);
        teachLead.displayInfo();

        System.out.println("Its business development time");

        // Hybrid Inheritance
        BusinessDevelopmentManager businessDevelopmentManager = new BusinessDevelopmentManager("Jssu", 505);
        businessDevelopmentManager.Coordinating();
    }
}

// Base class or Super class --->
class Employee {
    protected String name;
    protected int empId;

    public Employee(String name, int empId){
        this.name = name;
        this.empId = empId;
    }

    public void display(){
        System.out.printf("Employee: %s, ID: %d\n", name, empId);
    }
}

// Single Inheritance --->
class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int empId, String programmingLanguage) {
        super(name, empId);
        this.programmingLanguage = programmingLanguage;
    }

    public void show(){
        display();
        System.out.println("Specialization: Developer, Programming Languages: "+ programmingLanguage);
    }
}

// Multilevel Inheritance
class HR_Manager extends Employee{

    public HR_Manager(String name, int empId) {
        super(name, empId);
    }

    public void Handle_HrDuties(){
        System.out.println("Hr manager managing human resources duties");
    }
}

class HR_Director extends HR_Manager{

    public HR_Director(String name, int empId) {
        super(name, empId);
    }

    public void HrDirectorDuties(){
        System.out.println("HR Director Managing it's Hr Department");
    }
}

// Multiple Inheritance using interfaces
interface Project_Manager{
    void manageProject();
}

interface Team_Lead{
    void leadTeam();
}

class Teach_Lead extends Employee implements Project_Manager, Team_Lead{
    private String projectManaged;
    private int teamSize;

    public Teach_Lead(String name, int empId, String projectManaged, int teamSize) {
        super(name, empId);
        this.projectManaged = projectManaged;
        this.teamSize = teamSize;
    }

    public void displayInfo(){
        display();
        manageProject();
        leadTeam();
    }

    @Override
    public void manageProject() {
        System.out.println("Project manager managing its projects " + projectManaged);
    }

    @Override
    public void leadTeam() {
        System.out.println("Team lead is guiding of "+teamSize);
    }
}

// Hierarchical Inheritance
class Ceo extends Employee{

    public Ceo(String name, int empId) {
        super(name, empId);
    }

    public void ceoDuty(){
        System.out.println("CEO is leading the entire company");
    }
}

class Company_Director extends Employee{

    public Company_Director(String name, int empId) {
        super(name, empId);
    }

    public void directorDuties(){
        System.out.println("Company's director managing his entire company, I mean everything");
    }
}

// Hybrid Inheritance
interface Sales_Manager{
    void BoostSales();
}

class Marketing_manager extends Employee{
    public Marketing_manager(String name, int empId) {
        super(name, empId);
    }

    public void Strategy(){
        System.out.println("Marketing manager adding his strategy to grow their products rates");
    }
}

class BusinessDevelopmentManager extends Marketing_manager implements Sales_Manager{

    public BusinessDevelopmentManager(String name, int empId) {
        super(name, empId);
    }

    public void Coordinating(){
        Strategy();
        BoostSales();
        System.out.println("Business development manager coordinating business effort");
    }

    @Override
    public void BoostSales() {
        System.out.println("Sales manager boosting sales");
    }
}
package Oops_in_Java.CopyConstructors;

public class Copy_Constructor {
    public class Main {
        public static void main(String[] args) {
            student s1 = new student("Jasim Ansari", 456, "BCA");
            System.out.print("Name: "+ s1.name + "\nID: "+ s1.id + "\nQualification: "+ s1.qual + "\n");
            System.out.println("Afer BCA");
            student ms1 = new student(s1);
            ms1.id = 567;
            ms1.qual = "MCA";
            System.out.print("Name: "+ s1.name + "\nID: "+ ms1.id + "\nQualification: "+ ms1.qual + "\n");
            System.out.println("After MCA");
            student ms2 = new student(ms1);
            ms2.name = "Dr. Jasim Ansari";
            ms2.id = 678;
            ms2.qual = "PHD In Compueter Science";
            System.out.print("Name: "+ ms2.name + "\nID: "+ ms2.id + "\nQualification: "+ ms2.qual + "\n");
        }
    }
}

class student{
    String name;
    int id;
    String qual;

    student(String newname, int newid, String newqual){
        this.name = newname;
        this.id = newid;
        this.qual = newqual;
    }
    
    student(student obj){
        this.name = obj.name;
        this.id = obj.id;
        this.qual = obj.qual;
    }
}
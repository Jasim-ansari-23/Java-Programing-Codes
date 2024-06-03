package Oops_in_Java.Inheritance.Vahical_inheritance;

public class Vahical {
    public String name;
    public String model;
    public int noOfTyres;

    Vahical(String name, String model, int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    public void enginestarted(){
        System.out.printf("Engine has started of %s: %s\n", name, model);
    }

    public void enginestop() {
        System.out.printf("Engine has stoped of %s: %s\n", name, model);
    }
}
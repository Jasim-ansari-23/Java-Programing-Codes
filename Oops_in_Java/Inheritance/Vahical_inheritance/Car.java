package Oops_in_Java.Inheritance.Vahical_inheritance;

public class Car extends Vahical{
    public int noOfDoors;
    public String transmissionType;

    Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAc(){
        System.out.println(name + "'s AC has started");
    }
}
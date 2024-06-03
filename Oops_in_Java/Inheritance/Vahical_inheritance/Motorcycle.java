package Oops_in_Java.Inheritance.Vahical_inheritance;

public class Motorcycle extends Vahical{
    public String handlebar;
    public String suspensionTyre;

    Motorcycle(String name, String model, int noOfTyres, String handlebar, String suspensionTyre){
            super(name, model, noOfTyres);
            this.handlebar = handlebar;
            this.suspensionTyre = suspensionTyre;
    }

    public void wheelee(){
        System.out.println("MotorCycle is doing wheeleee! " + name);
    }
}

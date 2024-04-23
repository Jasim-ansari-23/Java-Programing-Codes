package Oops_Questions;

public class Get_Area {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3.0,10.0);
        double area = r.getarea();
        System.out.println("The area of rectangle is: "+area);
    }
}

class Shape{
    public double getarea(){
        return 0.0;
    }
}

class Rectangle extends Shape{
    public double length;
    public double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = length;
    }

    @Override
    public double getarea(){
        return length * width;
    }
}
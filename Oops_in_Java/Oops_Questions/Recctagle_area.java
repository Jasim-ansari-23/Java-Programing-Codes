package Oops_in_Java.Oops_Questions;

public class Recctagle_area {
    public static void main(String args[]){
        Rectangle rc = new Rectangle(30.12,55.52);
        System.out.println("The area of rectangle: "+ rc.get_area());
    }
    static class Area{
        public double get_area(){
            return 0.0;
        }
    }

    static class Rectangle extends Area {
        private double hight, width;
        public Rectangle(double hight, double width){
            this.hight = hight;
            this.width = width;
        }
        public double get_area(){
            return hight*width;
        }
    }
}

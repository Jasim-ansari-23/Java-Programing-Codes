package Oops_in_Java.Oops_Questions;

public class Room_Size {
    static class Home{
        float length, width;
        public void getData(float a, float b){
            length = a;
            width = b;
        }
    } 
    
    public static void main(String[] args) {
        float ans;
        Home room = new Home();
        room.getData(15.6f, 14.2f);
        ans = room.length * room.width;
        System.out.println(ans);
    }
}
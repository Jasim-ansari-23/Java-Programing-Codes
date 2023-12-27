package Oops_in_Java.CopyConstructors;
import java.util.Arrays;

public class Shallow_Copy {
    public static void main(String[] args) {
        int value[] = {3,7,8,9};
        Ex e = new Ex(value);
        e.showData();
        value[0] = 78;
        e.showData();
    }

    static class Ex {
        private int[] data;

        public Ex(int[] value){
            data = value;
        }

        public void showData(){
            System.out.println(Arrays.toString(data));
        }
    }
}

//Shallow copy - constructor will affect the data, means it'll copy and along with change the data
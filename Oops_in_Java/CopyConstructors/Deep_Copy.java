package Oops_in_Java.CopyConstructors;
import java.util.Arrays;

public class Deep_Copy {
    public static void main(String[] args) {
        int value[] = {3,7,8,9};
        Ex e = new Ex(value);
        e.showData();
        value[0] = 79;
        e.showData();
    }

    static class Ex {
        private int[] data;

        public Ex(int[] value){
            data = new int[value.length];
            for(int i = 0; i < data.length; i++){
                data[i] = value[i];
            }
        }

        public void showData(){
            System.out.println(Arrays.toString(data));
        }
    }
}

//Deep won't affect the data, means it'll only copy the data
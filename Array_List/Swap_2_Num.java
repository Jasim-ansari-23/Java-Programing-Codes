package Array_List;
import java.util.ArrayList;

public class Swap_2_Num {
    public static void Swap(ArrayList<Integer> arr, int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);
        int index1 = 1, index2 = 3;
        System.out.print("Before swapping the num: "+ arr);
        System.out.println();
        Swap(arr, index1, index2);
        System.out.print("After swapping the num: "+ arr);
    }
}
package Array_List;
import java.util.*;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);
        System.out.println("Default value: "+arr);

        // Sort it in ascending order
        Collections.sort(arr);
        System.out.println("After sorting in ascending order: "+arr);

        // Sort in descending order
        Collections.sort(arr, Collections.reverseOrder()); // It is a Comparator function
        System.out.println("After sorting in descending order: "+arr);
    }
}

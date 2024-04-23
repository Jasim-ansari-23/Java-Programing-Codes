package Array_List;
import java.util.ArrayList;

public class Main_Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add something inside the array list without replacing the element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        // To check/print which element at which index
        // Get operation
        int element = list.get(3);
        System.out.println(element);

        // Delete an element
        list.remove(2);
        System.out.println(list);

        // Do set operation
        // Set an element at particular place, it'll replace the element
        list.set(2, 6);
        System.out.println(list);

        // Check does element exist or not, if then return true, otherwise false
        System.out.println(list.contains(2)); // true
        System.out.println(list.contains(4)); // false

        // Print ArrayList Size
        System.out.println("Size of an array: "+ list.size());

        // To print array list items in two ways
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        // It is built for printing ArrayList items
        for(int num : list){
            System.out.print(num);
        }

        // Remove all element
        list.removeAll(list);
        System.out.println(list);
    }
}

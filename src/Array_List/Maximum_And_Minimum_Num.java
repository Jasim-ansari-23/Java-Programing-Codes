package Array_List;

import java.util.ArrayList;

public class Maximum_And_Minimum_Num {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(8);
        arr.add(9);
        arr.add(5);
        arr.add(3);

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.size(); i++){
//            if(max < arr.get(i)){
//                max = arr.get(i);
//            }
//            if (min > arr.get(i)) {
//                min = arr.get(i);
//            }
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }

        System.out.println("Maximum num is: " + max);
        System.out.println("Minimum num is: " + min);
    }
}

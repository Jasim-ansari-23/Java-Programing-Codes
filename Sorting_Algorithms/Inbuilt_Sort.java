package Sorting_Algorithms;
import java.util.Arrays;
import java.util.Collections;

public class Inbuilt_Sort {
    public static void main(String args[]){
        Integer arr[] = {5,4,1,3,2};
        Arrays.sort(arr); // -> it will sort all array's element - ascending order 
        Arrays.sort(arr, 0, 3); // -> If you want to sort the Arrays from 0 to particular place then you will have to put index starting from one not zero.
        Arrays.sort(arr,Collections.reverseOrder()); // -> For sorting an array in descending order
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // -> Want to reverse an array from zero to particular place
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

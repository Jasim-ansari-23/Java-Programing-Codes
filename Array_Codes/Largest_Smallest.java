package Array_Codes;

import java.util.Scanner;

public class Largest_Smallest {
    public static void getLargestandSmallest(int nums[]){
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            }
        }
        System.out.println("Largest number in an array is: " + largest);
        System.out.println("Smallest number in an array is: " + smallest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int nums[] = {56, 66,83, 23, 31, 889, 96, 51, 11};
        getLargestandSmallest(nums);
        sc.close();
    }
}
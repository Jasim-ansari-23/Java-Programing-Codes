package Leet_Codes_Questions;
import java.util.Arrays;

public class Key_pair {
    public static void Twopair(int arr[], int target){
        Arrays.sort(arr);
        int left = 0, right = arr.length-1;
        while(left < right){
            int currentSum = arr[left] + arr[right];
            if(currentSum == target){
                System.out.println("Target found: " + arr[left] + " + " + arr[right] + " = " + target);
                return;
            }else if(currentSum < target) {
                left++;
            }else{
                right--;
            }
        }
        System.out.println("There is no, given pair");
    }

    public static void main(String[] args) {
        int arr[] = {1,4,45,6,8,10}, target = 16;
        Twopair(arr, target);
    }
}

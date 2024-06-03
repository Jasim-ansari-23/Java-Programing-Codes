package Array_Codes;

import java.util.Arrays;

public class TwoSum {
    public static void Two_Sum(int nums[], int target){
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while(left < right){
            int currentSum = nums[left] + nums[right];
            if(currentSum == target){
                System.out.println("Target found: " + nums[left] + " + " + nums[right] + " = " + target);
                return;
            }
            else if(currentSum < target){
                left++;
            }
            else if(currentSum > target){
                right--;
            }
        }
    }
    public static void main(String args[]){
        int nums[] = {1,4,45,6,10,8}, target = 16;
        Two_Sum(nums, target);
    }
}

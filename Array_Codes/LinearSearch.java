package Array_Codes;

public class LinearSearch {
    public static int linear_Search(int nums[], int key){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int num[] = {11,22,33,44,55,66,77,88}, key = 44;
        int index = linear_Search(num, key);
        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Key found at index: "+ index);
        }
    }
}

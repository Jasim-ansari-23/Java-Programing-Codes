package Array_Codes;

public class Binary_Search {
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr[] = {4,8,10,14,18,20}, key = 12;
        int found = binarySearch(arr, key);
        if(found == -1){
            System.out.println(key +": Doesn't exist");
        }else{
            System.out.println("Found at index: "+ found);
        }
    }
}

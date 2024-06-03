package Array_Codes;

public class Largest_Element {
    static int largestElement(int[] arr, int n) {
        int largest = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int arr[] = {4, 7, 8, 6, 7, 6}, n = 6;
        int largest = largestElement(arr, n);
        System.out.print("The largest number is: " + largest);
    }
}

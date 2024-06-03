package Array_Codes;

public class Swap_Negative {
    public static void main(String args[]) {
        int arr[] = {11, -7, 23, -3, -13, 40, 45};
        swapNegative(arr);
        System.out.println("Printing the array0");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void swapNegative(int arr[]){
        int j = 0;
        for(int index = 0; index<arr.length; index++){
            if(arr[index] < 0){
                int temp = arr[index];
                arr[index] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}

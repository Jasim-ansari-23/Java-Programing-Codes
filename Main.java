import java.util.*;

public class Main {
    public static void quickSort(int arr[], int start_index, int end_index){
        if(start_index < end_index){
            int pivot_index = partition(arr, start_index, end_index);
            quickSort(arr, start_index, pivot_index-1);
            quickSort(arr, pivot_index+1, end_index);
        }
    }

    public static int partition(int arr[], int start_index, int end_index){
        int pivot_index = arr[end_index];
        int i = start_index - 1;
        for(int j = start_index; j < end_index; j++){
            if(arr[j] <= pivot_index){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end_index];
        arr[end_index] = temp;

        return i + 1;
    }

    public static void printQuickSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printQuickSort(arr);
    } 
}
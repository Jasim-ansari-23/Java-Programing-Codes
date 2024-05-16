package Sorting_Algorithms;

public class Marge_sort {
    public class Main {
        public static void mergeSort(int arr[], int start_index, int end_index) {
            if (start_index < end_index) {
                int mid = start_index + (end_index - start_index) / 2;
                mergeSort(arr, start_index, mid); // left part
                mergeSort(arr, mid + 1, end_index); // right part
                merge(arr, start_index, mid, end_index);
            }
        }
    
        public static void merge(int arr[], int start_index, int mid, int end_index) {
            int temp[] = new int[end_index - start_index + 1];
            int i = start_index, j = mid + 1, k = 0;
    
            while (i <= mid && j <= end_index) {
                if (arr[i] < arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                }
            }
    
            while (i <= mid) {
                temp[k++] = arr[i++];
            }
    
            while (j <= end_index) {
                temp[k++] = arr[j++];
            }
    
            for (k = 0, i = start_index; k < temp.length; k++, i++) {
                arr[i] = temp[k];
            }
        }
    
        public static void printMerge(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            int arr[] = {6, 3, 9, 5, 2, 8};
            mergeSort(arr, 0, arr.length - 1);
            printMerge(arr);
        }
    }    
}

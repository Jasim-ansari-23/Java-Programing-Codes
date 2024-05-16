package Sorting_Algorithms;

public class Insertion_Sort {
    public static void insertion_sort(int arr[]){
        for(int turn = 1; turn<arr.length; turn++){
            int currentElement = arr[turn], previos = turn -1;
            while(previos >= 0 && arr[previos] > currentElement){
                arr[previos+1] = arr[previos];
                previos--;
            }
            arr[previos+1] = currentElement;
        }
    }

    public static void display(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        insertion_sort(arr);
        display(arr);
    }
}

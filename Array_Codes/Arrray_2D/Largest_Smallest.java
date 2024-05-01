package Array_Codes.Arrray_2D;

public class Largest_Smallest {
    public static void LargestAndSmallest(int[][] arr, int row, int col){
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(largest < arr[i][j]){
                    largest = arr[i][j];
                }
                if(smallest > arr[i][j]){
                    smallest = arr[i][j];
                }
            }
        }
        System.out.println("Largest number in an array is: " + largest);
        System.out.println("Smallest number in an array is: " + smallest);
    }
    public static void main(String args[]) {
        int[][] arr = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int row = 3, col = 3;
        LargestAndSmallest(arr, row, col);
    }
}

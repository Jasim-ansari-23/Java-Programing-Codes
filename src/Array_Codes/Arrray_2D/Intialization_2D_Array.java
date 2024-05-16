package Array_Codes.Arrray_2D;

public class Intialization_2D_Array {
    public static void display_2_D(int[][] arr, int row, int col){
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int row = 3, col = 4;
        display_2_D(arr, row, col);
    }
}
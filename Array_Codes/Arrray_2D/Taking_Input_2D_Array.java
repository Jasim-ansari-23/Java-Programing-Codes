package Array_Codes.Arrray_2D;

import java.util.Scanner;

public class Taking_Input_2D_Array {
    public static void display_2_D(int[][] arr, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int row = 3, col = 4, i, j;
        for(i = 0; i<row; i++){
            for(j = 0; j<col; j++){
                System.out.print("Enter the row " + i + " value and column value " + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }
        display_2_D(arr, row, col);
        sc.close();
    }
}

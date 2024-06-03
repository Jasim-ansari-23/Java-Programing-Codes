package Array_Codes.Arrray_2D;

public class Linear_Search {
    public static boolean linearSearch(int[][] arr, int row, int col, int target){
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(arr[i][j] == target){
                    System.out.print("Target found at row - "+ i +" & column "+ j +" - ("+ target +")");
                    return true;
                }
            }
        }
        System.out.print("Not found");
        return false;
    }

    public static void main(String args[]) {
        int[][] arr = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int row = 3, col = 3, target = 80;
        linearSearch(arr, row, col, target);
    }
}

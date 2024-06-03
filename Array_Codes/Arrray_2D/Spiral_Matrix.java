package Array_Codes.Arrray_2D;

public class Spiral_Matrix {
    public static void spiralMatrix(int matrix[][]){
        int startingRow = 0, startingCol = 0, endingRow = matrix.length-1, endingCol = matrix[0].length-1;
        while(startingRow <= endingRow && startingCol <= endingCol){
            //top
            for(int col=startingCol; col<=endingCol; col++){
                System.out.print(matrix[startingRow][col] + " ");
            }
            //right
            for(int row=startingRow; row<=endingRow; row++){
                System.out.print(matrix[row][endingCol] + " ");
            }
            //bottom
            for(int col=endingCol-1; col>=startingCol; col--){
                if(startingRow == endingRow){
                    break;
                }
                System.out.print(matrix[endingRow][col] + " ");
            }
            //left
            for(int row=endingRow-1; row>=startingRow; row--){
                if(startingCol == endingCol){
                    break;
                }
                System.out.print(matrix[row][startingCol] + " ");
            }
            startingCol++;
            startingRow++;
            endingCol--;
            endingRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}
        };
        spiralMatrix(matrix);
    }
}

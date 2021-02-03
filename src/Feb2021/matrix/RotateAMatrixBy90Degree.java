package Feb2021.matrix;

import java.util.Scanner;

public class RotateAMatrixBy90Degree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        
        while (numberOfCases-- > 0) {
            int rowsAndColumn = sc.nextInt();
            int[][] matrix = new int[rowsAndColumn][rowsAndColumn];

            for (int i = 0; i < rowsAndColumn; i++) {
                for (int j = 0; j < rowsAndColumn; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            //rotatingMatrix(matrix);
            //printingResult(matrix);
        }
    }


}

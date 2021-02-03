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
            
            rotatingMatrix(matrix);
            printingResult(matrix);
        }
    }

    private static void printingResult(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotatingMatrix(int[][] matrix) {
        // To rotate a matrix by 90 degree -
        // First: Take the Transpose of the Matrix
        transposeMatrix(matrix);

        // Second: Swap the elements in each column
        reverseColumnElements(matrix);
    }

    private static void reverseColumnElements(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0, k = matrix[0].length - 1; j < k; j++, k--) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }
    }

    private static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }


}

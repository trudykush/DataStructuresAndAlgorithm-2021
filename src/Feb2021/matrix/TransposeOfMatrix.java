package Feb2021.matrix;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases..");
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            System.out.println("Enter the rows of matrix");
            int r1 = sc.nextInt();
            System.out.println("Enter the columns of matrix");
            int c1 = sc.nextInt();
            int[][] testMatrix = new int[r1][c1];
            System.out.println("Enter the elements of matrix separated by space");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    testMatrix[i][j] = sc.nextInt();
                }
            }

            // method to transpose the matrix
            int[][] result = matrixTranspose(testMatrix, r1, c1);

            printMatrix(result);
        }
    }

    private static void printMatrix(int[][] result) {
        for (int[] ints : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixTranspose(int[][] testMatrix, int r1, int c1) {
        for (int i = 0; i < r1; i++) {
            for (int j = i+1; j < c1; j++) {
                int temp = testMatrix[i][j];
                testMatrix[i][j] = testMatrix[j][i];
                testMatrix[j][i] = temp;
            }
        }
        return testMatrix;
    }
}

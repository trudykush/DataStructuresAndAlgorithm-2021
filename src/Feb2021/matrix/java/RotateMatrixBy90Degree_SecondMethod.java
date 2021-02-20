package Feb2021.matrix.java;

import java.util.Scanner;

/*
* Algorithm:

There is N/2 squares or cycles in a matrix of side N.
 Process a square one at a time.
 Run a loop to traverse the matrix a cycle at a time,
 i.e loop from 0 to N/2 – 1, loop counter is i
Consider elements in group of 4 in current square,
 rotate the 4 elements at a time.
 So the number of such groups in a cycle is N – 2*i.
So run a loop in each cycle from x to N – x – 1, loop counter is y
The elements in the current group is (x, y), (y, N-1-x), (N-1-x, N-1-y),
 (N-1-y, x), now rotate the these 4 elements, i.e (x, y) <- (y, N-1-x),
 (y, N-1-x)<- (N-1-x, N-1-y), (N-1-x, N-1-y)<- (N-1-y, x), (N-1-y, x)<- (x, y)
Print the matrix.
* */

public class RotateMatrixBy90Degree_SecondMethod {

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

            rotatingMatrix(matrix, rowsAndColumn);
            displayMatrix(matrix);
        }
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void rotatingMatrix(int[][] matrix, int N) {
        // Consider all squares one by one
        for (int i = 0; i < N / 2; i++) {
            // Consider elements in group of 4 in current square
            for (int j = i; j < N - i - 1; j++) {
                // Store current cell in temp variable
                int temp = matrix[i][j];

                // Move the element from right to top
                matrix[i][j] = matrix[j][N - 1 - i];

                // Move the element from bottom to right
                matrix[j][N - 1 - i] = matrix[N - 1 - i][N - 1 - j];

                // Move values from left to bottom
                matrix[N - 1 - i][N - 1 - j] =
                            matrix[N - 1 - j][i];

                // Assign temp to left
                matrix[N - 1 - j][i] = temp;
            }
        }
    }
}

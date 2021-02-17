package Feb2021.searching.java;

import java.util.Scanner;

// TODO: Find square root of a number or if not a perfect square, get floor number
public class SquareRootOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int inputNumber = sc.nextInt();

            squareRootOrFloorNumber(inputNumber);
        }
    }

    private static int squareRootOrFloorNumber(int inputNumber) {
        int low = 0, high = inputNumber, ans = 0;
        while(low < high) {

            int mid = (low + high) >>> 1;
            int midSquare = mid*mid;
            if (midSquare == inputNumber) {
                return mid;
            }
            if (midSquare < inputNumber) {
                low = mid+1;
                ans = mid;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }
}

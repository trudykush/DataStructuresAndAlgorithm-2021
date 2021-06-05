package June2021.Stack;

import java.util.Scanner;

public class ImplementTwoStackInArray {

    int size;
    int top1, top2;
    int arr[] = new int[100];

    ImplementTwoStackInArray() {
        size = 100;
        top1 = -1;
        top2 = size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            ImplementTwoStackInArray sq = new ImplementTwoStackInArray();
            int q = sc.nextInt();
            while (q > 0) {
                int stack_no = sc.nextInt();
                int queryType = sc.nextInt();

                TwoStack twoStack = new TwoStack();
                if (queryType == 1) {
                    int a = sc.nextInt();
                    if (stack_no == 1) {
                        twoStack.push1(a, sq);
                    }
                } else if(queryType == 2) {

                }

            }

        }
    }

    private static class TwoStack {
        public void push1(int a, ImplementTwoStackInArray sq) {

        }
    }
}

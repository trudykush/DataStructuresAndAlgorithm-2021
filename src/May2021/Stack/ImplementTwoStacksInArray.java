package May2021.Stack;

import java.util.Scanner;

public class ImplementTwoStacksInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            MyStack myStack = new MyStack();
            System.out.println("Enter the size of array");
            int n = sc.nextInt();

            // size should be less than n
            System.out.println("Enter the size of first array");
            int n1 = sc.nextInt();
            for (int i = 0; i < n1; i++) {
                myStack.push1(sc.nextInt());
            }

            // size should be less than n-n1
            System.out.println("Enter the size of second array");
            int n2 = sc.nextInt();
            for (int i = 0; i < n2; i++) {
                myStack.push2(sc.nextInt());
            }
        }
        
    }

    private static class MyStack {
        public void push1(int nextInt) {

        }

        public void push2(int nextInt) {

        }
    }
}

package May2021.Stack;

import java.util.Scanner;

public class ImplementTwoStacksInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            MyStack myStack = new MyStack();

            System.out.println("Enter the size of first array");
            int n1 = sc.nextInt();
            for (int i = 0; i < n1; i++) {
                myStack.push(sc.nextInt());
            }

            System.out.println("Enter the size of second array");
            int n2 = sc.nextInt();
            for (int i = 0; i < n2; i++) {
                myStack.push(sc.nextInt());
            }
        }
        
    }

    private static class MyStack {
        public void push(int nextInt) {

        }
    }
}

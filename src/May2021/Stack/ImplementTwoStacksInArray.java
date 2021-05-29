package May2021.Stack;

import java.util.Scanner;

public class ImplementTwoStacksInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        while (numberOfCases-- > 0) {
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            MyStack myStack = new MyStack(n);

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
        int size;
        int top1, top2;
        int arr[];

        MyStack(int n) {
            size = n;
            top1 = -1;
            top2 = size;
            arr = new int[n];
        }

        public void push1(int nextInt) {
            if(top1 < top2 - 1) {
                top1++;
                arr[top1] = nextInt;
            } else {
                System.out.println("Stack overflow");
                System.exit(1);
            }
        }

        public void push2(int nextInt) {
            if (top1 < top2 - 1) {
                top2--;
                arr[top2] = nextInt;
            } else {
                System.out.println("Stack overflow");
                System.exit(1);
            }
        }

        public int pop1() {
            if (top1 >= 0) {
                int x = arr[top1];
                top1--;
                return x;
            } else {
                System.out.println("Stack underflow");
                System.exit(1);
            }
            return 0;
        }


    }
}

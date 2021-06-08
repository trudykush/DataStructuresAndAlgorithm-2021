package June2021.Stack;

import java.util.Scanner;

public class DeleteMiddleElementStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();

        MyStackLinkedList myStack = new MyStackLinkedList();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int queryType = sc.nextInt();
                if (queryType == 1) {   // push
                    int x = sc.nextInt();
                    myStack.push(x);
                } else { // pop
                    int x = sc.nextInt();
                    System.out.println(myStack.pop() + " ");
                }
            }
        }
    }

    private static class MyStackLinkedList {

        public class Node {
            int data;
            Node next;

            Node(int x) {
                this.data = x;
                next = null;
            }
        }

        Node head;

        MyStackLinkedList() {
            this.head = null;
        }
        public void push(int x) {
            Node temp = new Node(x);

            if (head == null) {
                head = temp;
            }
            temp.next = head;
            head = temp;
        }

        public int pop() {
            Node temp = head;
            if (temp == null) {
                System.out.println("Stack underflow");
                return -1;
            } else {
                temp = temp.next;
                int r = temp.data;
                head = temp;
                return r;
            }
        }
    }

}

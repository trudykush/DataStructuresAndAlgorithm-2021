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

        public boolean isEmpty() {
            return head == null;
        }

        public int peek() {
            if (!isEmpty()) {
                return head.data;
            } else {
                System.out.println("Stack is Empty");
                return -1;
            }
        }

        public void display() {
            if (head == null) {
                System.out.println("Stack is empty");
                System.exit(1);
            } else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }

        // n -> size of array
        // curr -> current item number
        public void deleteMid(int n, int curr) {
            if (isEmpty() || curr == n) {
                return;
            }

            int poppedElement = pop();

            deleteMid(n, curr+1);

            if (curr != n/2) {
                push(poppedElement);
            }
        }
    }

}

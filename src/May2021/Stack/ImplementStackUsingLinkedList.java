package May2021.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class ImplementStackUsingLinkedList {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t > 0) {
            MyStackLinkedList obj = new MyStackLinkedList();
            int Q = Integer.parseInt(read.readLine());
            int k = 0;
            String[] str = read.readLine().trim().split(" ");
            while (Q > 0) {
                int queryType = 0;
                queryType = Integer.parseInt(read.readLine());
                if (queryType == 1) {
                    int a = Integer.parseInt(str[k++]);
                    obj.push(a);
                } else if (queryType == 2) {
                    obj.pop();
                }
                Q--;
            }
            System.out.println(" ");
            t--;
        }
    }

    private static class MyStackLinkedList {

        private class Node {
            int data;
            Node next;
        }

        Node top;

        MyStackLinkedList() {
            this.top = null;
        }

        public void push(int a) {
            Node temp = new Node();
            if (temp == null) {
                System.out.println("Heap OverFlow");
                return;
            }
            temp.data = a;
            temp.next = top;
            top = temp;
        }

        public int peek() {
            if (isEmpty()) {
                return top.data;
            } else {
                System.out.println("Stack is Empty");
                return -1;
            }
        }

        public void pop() {
            if (top == null) {
                System.out.println("Stack UnderFlow");
                return;
            }
            top = (top).next;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public void display() {

            if (top == null) {
                System.out.println("Stack UnderFlow");
                exit(1);
            }
            else {
                Node temp = top;
                while (temp != null) {
                    System.out.printf("%d->", temp.data);
                    temp = temp.next;
                }
            }
        }
    }
}

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
                    obj.display();
                } else if (queryType == 2) {
                    obj.pop();
                    obj.display();
                }
                Q--;
            }
            System.out.println(" ");
            t--;
        }
    }

    private static class MyStackLinkedList {

        // A linked list node
        private class Node {
            int data;
            Node next;
        }

        Node top;

        MyStackLinkedList() {
            this.top = null;
        }

        // to add element in the stack
        public void push(int a) {
            // create a new node temp and allocate memory
            Node temp = new Node();

            // check if stack (heap) is full.
            // Then inserting an element would lead to stack overflow
            if (temp == null) {
                System.out.println("Heap OverFlow");
                return;
            }
            // initialize data into temp data field
            temp.data = a;
            //put top ref into temp link
            temp.next = top;
            // update top ref
            top = temp;
        }

        // utility function to return top element in a stack
        public int peek() {
            // check for empty stack
            if (!isEmpty()) {
                return top.data;
            } else {
                System.out.println("Stack is Empty");
                return -1;
            }
        }

        // utility function to pop top element from the stack
        public int pop() {
            Node temp = top;

            //if node at temp pointer is null, the stack is empty so we return -1.
            if (temp == null) {
                System.out.println("Stack Underflow");
                return -1;
            } else {
                //storing the data at top node and deleting that node.
                temp = temp.next;
                int r = top.data;
                top = temp;

                //returning the data.
                return r;
            }
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

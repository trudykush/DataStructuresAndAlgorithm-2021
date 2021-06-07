package June2021.Stack;

import sun.plugin2.applet.StopListener;

public class MinimumElementInStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }

    private static class MyStack {
        MyStackUsingLinkedList myStack;
        Integer minElement;

        MyStack() {
            myStack = new MyStackUsingLinkedList();
        }

        public void push(int x) {
            if (myStack.isEmpty()) {
                minElement = x;
                myStack.push(x);
                System.out.println("Number inserted" + x);
                return;
            }

            // if stack is not empty and
            // new number is less than original minElement
            if (x < minElement) {
                myStack.push(2 * x - minElement);
                minElement = x;
            } else {
                myStack.push(x);
            }
            System.out.println("Number Inserted: " + x);
        }

        public void getMin() {
            if (myStack.isEmpty()) {
                System.out.println("Stack is empty");
            } else {
                System.out.println("Minimum element is: " +
                        minElement);
            }
        }

        public void pop() {
            if (myStack.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.print("Top element removed: ");
            Integer t = myStack.pop();

            // minimum will change as the minimum element
            // of the stack is being removed
            if (t < minElement) {
                System.out.println(minElement);
                minElement = 2 * minElement - t;
            } else {
                System.out.println(t);
            }

        }

        public void peek() {
            if (myStack.isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }

            // top element
            Integer t = myStack.peek();
            System.out.print("Top Most Element is: ");

            // if t < minElement means minEle stores values of t
            if (t < minElement) {
                System.out.print(minElement);
            } else {
                System.out.print(t);
            }
        }
    }

    // Implementing Stack from scratch
    private static class MyStackUsingLinkedList {

        // A linked list node
        private class Node {
            int data;
            Node next;
        }

        Node top;

        MyStackUsingLinkedList() {
            this.top = null;
        }

        // to add element in the stack
        public void push(int a) {
            // create a new node temp and allocate memory
            Node temp = new Node();

            // check if stack(heap) is full
            // then inserting an element would lead to stack overflow
            if (temp == null) {
                System.out.println("Heap overflow");
                return;
            }
            // initialize data into temp data field
            temp.data = a;
            // put top ref into temp link
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

        private boolean isEmpty() {
            return top == null;
        }

        public int pop() {
            Node temp = top;
            // if node at temp pointer is null =>
            // the stack is empty so we return 1-
            if (temp == null) {
                return -1;
            } else {
                // storing the data at top node and deleting the node
                temp = temp.next;
                int r = top.data;
                top = temp;

                // returned the data
                return r;
            }
        }

        public void display() {
            if (top == null) {
                System.out.println("Stack Undeflow");
                System.exit(1);
            } else {
                Node temp = top;
                while (temp != null) {
                    System.out.println("%d -> " + temp.data);
                    temp = temp.next;
                }
            }
        }
    }
}

package May2021.codingChallenges;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
*
    Design and implement a data structure for LRU (Least Recently Used) cache.
    * It should support the following operations: get and set.
get(key) - Get the value of the key if the key exists in the cache, otherwise return -1.
* set(key, value) - Set or insert the value if the key is not already present.
* When the cache reaches its capacity, it should invalidate the least recently used item
* before inserting the new item.
The LRU Cache will be initialized with an integer corresponding to its capacity.
* Capacity indicates the maximum number of unique keys it can hold at a time.
Sample Input and Expected Output :
         capacity = 2
         set(1, 9)
         set(6, 12)
         get(6)        returns 12
         get(1)        returns 9
         get(10)       returns -1
         set(7, 14)    this pushes out key = 6 as LRU is full.
         get(6)        returns -1

* */
public class LRU {
    public static void main(String[] args) {
        HashMap<Integer, Integer> cacheHM = new HashMap<>(2);

        MyStackNode obj = new MyStackNode();
        Queue<Integer> queue = new LinkedList<>();

        // TODO: before putting check the size
        int counter = 0;
        cacheHM.put(1, 9);
        counter++;
        cacheHM.put(6, 12);
        counter++;

        if (counter >= cacheHM.size()) {
            cacheHM.get(6);
            if (cacheHM.containsKey(6)) {
                queue.add(6);
            } else {
                System.out.println("-1");
            }

            cacheHM.get(1);
            if (cacheHM.containsKey(1)) {
                queue.add(1);
            } else {
                System.out.println("-1");
            }
        } else {
            //Assuming it knows it full
            int LRU_Int = queue.peek();

            cacheHM.remove(LRU_Int); //We have s[ce in hashMap

            cacheHM.put(7,12);
        }

    }

    private static class MyStackNode {
        private class Node {
            int data;
            Node next;
        }

        Node top;

        public MyStackNode() {
            this.top = null;
        }

        public void push(int value) {

            Node temp = new Node();

            if (temp == null) {
                System.out.println("Overflow");
                return;
            }

            temp.data = value;
            temp.next = top;
            top = temp;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int peek() {
            if (isEmpty()) {
                return top.data;
            } else {
                System.out.println("is Empty");
                return -1;
            }
        }

        public int pop() {
            Node temp = top;
            if (temp == null) {
                System.out.println("Underflow");
                return -1;
            } else {
                temp = temp.next;
                int x = top.data;
                top = temp;

                return x;
            }
        }
    }


}

package March2021.test;

import java.util.*;

public class MediaFile {
    public static void main(String[] args) {
        List<Integer> lList = new ArrayList<Integer>();

        lList.add(4);
        lList.add(8);
        lList.add(6);
        lList.add(12);
//        lList.add(9);
//        lList.add(1);
//        lList.add(5);

//        int result = mergeFiles(lList);
        int result = minComputation(lList.size(), lList);
        System.out.println(result);
    }

    // Function to find minimum computation
    static int minComputation(int size, List<Integer> files)
    {

        // create a min heap
        PriorityQueue<Integer> pq
                = new PriorityQueue<>();

        for (int i = 0; i < size; i++) {

            // add sizes to priorityQueue
            pq.add(files.get(i));
        }

        // variable to count total computations
        int count = 0;

        while (pq.size() > 1) {

            // pop two smallest size element
            // from the min heap
            int temp = pq.poll() + pq.poll();

            // add the current computations
            // with the previous one's
            count += temp;

            // add new combined file size
            // to priority queue or min heap
            pq.add(temp);
        }

        return count;
    }


    private static int mergeFiles(List<Integer> lList) {
        int result = 0;
        Collections.sort(lList);
        int initialSum = lList.get(0) + lList.get(1);

        for (int i = 2; i < lList.size(); i++) {
            result = initialSum + lList.get(i);
        }
        return result;
    }
}


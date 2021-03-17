package March2021.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class OrderDeliveryRoute {
    public static void main(String[] args) {
//        int[][] arr = { { 1, 0, 0 }, { 1, 0, 0 }, { 1, 9, 1 } };
        List<Integer> l1 =  new ArrayList<>();
        l1.add(1);
        l1.add(0);
        l1.add(0);

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(0);
        l2.add(0);

        List<Integer> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(9);
        l3.add(1);

        List<List<Integer>> finalList = new ArrayList<>();
        finalList.add(l1);
        finalList.add(l2);
        finalList.add(l3);

        int result = minimumDistance(finalList);
        System.out.println(result);
    }

    private static int minimumDistance(List<List<Integer>> finalList) {

        int pointer = finalList.get(0).get(0);
        int result = -1;

        for (int i = 0; i < finalList.size() - 1; i++) {                // rows
            for (int j = 0; j < finalList.get(i).size() - 1; j++) {     // columns
                if (finalList.get(i).get(j+1) == 1) {
                    // move right
                    pointer = finalList.get(i).get(j+1);
                    result++;
                } else if (finalList.get(i+1).get(j) == 1) {
                    // move down for right
                    pointer = finalList.get(i+1).get(j);
                    result++;
                }  else if ((i > 0) && (finalList.get(i-1).get(j) == 1)) {
                    // move left
                    pointer = finalList.get(i-1).get(j);
                    result++;
                } else if ((i > 0) && (j < finalList.size()) && (finalList.get(i).get(j-1) == 1)) {
                    // move down for left
                    pointer = finalList.get(i+1).get(j);
                    result++;
                } else if (pointer == 9) {
                    return ++result;
                }
            }
        }
        return ++result;
    }
}

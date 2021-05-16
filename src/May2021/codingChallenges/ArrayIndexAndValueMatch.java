package May2021.codingChallenges;

public class ArrayIndexAndValueMatch {

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.
        System.out.println("This is a debug message");
        int[] arr = {-3, -1, 1, 3, 5};
        int[] arr1 = {0, 0, 1};


        ArrayIndexAndValueMatch obj = new ArrayIndexAndValueMatch();
        int index = obj.binarySearch(arr1);
        System.out.print(index);

    }


    // input array => arr
    // number to find -> x
    int binarySearch(int arr[]) {
        int l = 0, r = arr.length - 1;
        while(l <= r) {
            int mid = l + (r - l)/2;

            if (arr[mid] == mid) {
                return mid;
            }

            if (arr[mid] < mid) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }
}


// import java.util.*;

public class BinarySearch {

    public static int binarySearch(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        // Must be sorted Array
        int number[] = { 6, 11, 12, 49, 63, 78, 89 };
        int key = 89;

        System.out.println("The index of Binary Search value after found: " + binarySearch(number, key));
    }
}

// Time Complexity of binary search is O(logn)
// => n/2^k = 1
// => n = 2^k
// => k = logn
// => O(logn)
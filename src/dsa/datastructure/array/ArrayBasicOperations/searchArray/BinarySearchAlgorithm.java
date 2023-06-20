package dsa.datastructure.array.ArrayBasicOperations.searchArray;

import java.util.Arrays;

public class BinarySearchAlgorithm implements SearchAlgorithm {
    @Override
    public int search(int[] array, int element) {
        // Binary Search Algorithm implementation
        Arrays.sort(array);
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

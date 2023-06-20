package dsa.datastructure.array.ArrayBasicOperations.searchArray;

public class RecursiveBinarySearchAlgorithm implements SearchAlgorithm{
    @Override
    public int search(int[] array, int element) {
        // Recursive Binary Search Algorithm implementation
        return recursiveBinarySearch(array, 0, array.length - 1, element);
    }

    private int recursiveBinarySearch(int[] array, int low, int high, int element) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                return recursiveBinarySearch(array, mid + 1, high, element);
            } else {
                return recursiveBinarySearch(array, low, mid - 1, element);
            }
        }
        return -1;
    }
}

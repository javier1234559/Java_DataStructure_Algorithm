package dsa.datastructure.array.ArrayBasicOperations.searchArray;

public class TernarySearchAlgorithm implements SearchAlgorithm{
    @Override
    public int search(int[] array, int element) {
        // Ternary Search Algorithm implementation
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int thirdPart = (high - low) / 3;
            int mid1 = low + thirdPart;
            int mid2 = high - thirdPart;

            if (array[mid1] == element) {
                return mid1;
            } else if (array[mid2] == element) {
                return mid2;
            } else if (array[mid1] > element) {
                high = mid1 - 1;
            } else if (array[mid1] < element && array[mid2] > element) {
                high = mid2 - 1;
                low = mid1 + 1;
            } else if (array[mid2] < element) {
                low = mid2 + 1;
            }
        }
        return -1;
    }
}

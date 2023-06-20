package dsa.datastructure.array.ArrayBasicOperations.searchArray;

public class SentinelLinearSearchAlgorithm implements SearchAlgorithm{
    @Override
    public int search(int[] array, int element) {
        // Sentinel Linear Search Algorithm implementation
        int last = array[array.length - 1];
        array[array.length - 1] = element;
        int i = 0;
        while (array[i] != element) {
            i++;
        }
        array[array.length - 1] = last;
        if (i < array.length - 1 || array[array.length - 1] == element) {
            return i;
        }
        return -1;
    }
}

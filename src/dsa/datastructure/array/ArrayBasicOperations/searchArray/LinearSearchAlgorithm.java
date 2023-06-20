package dsa.datastructure.array.ArrayBasicOperations.searchArray;

public class LinearSearchAlgorithm implements SearchAlgorithm {
    @Override
    public int search(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }
}

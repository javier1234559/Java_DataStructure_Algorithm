package dsa.datastructure.array.ArrayBasicOperations.sort;

public class SelectionSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        // Selection Sort Algorithm implementation
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    // Swap the elements
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
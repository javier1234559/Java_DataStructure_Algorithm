package dsa.datastructure.array.ArrayBasicOperations.sort;

public class BubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        // Bubble Sort Algorithm implementation
        int n = array.length;
        for (int i = 0; i < n; i++) { //access each element
            for (int j = 0; j < n - 1 - i; j++) { // compare each element with the next element
                if (array[j] > array[j + 1]) { // bubble up the largest element to the end
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
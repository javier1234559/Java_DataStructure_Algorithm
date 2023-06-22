package dsa.datastructure.array.ArrayBasicOperations.sort;

import java.util.Collection;

public class QuickSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a]; //swap
        array[a] = array[b];
        array[b] = temp;
    }

    public void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            // recursive call on the left of pivot
            quickSort(array, left, pivot - 1);
            // recursive call on the right of pivot
            quickSort(array, pivot + 1, right);
        }
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right]; //set pivot a the rightest
        int realIndex = left - 1; // This will actually go to right

        for (int i = left; i <= right - 1; i++) {
            if (array[i] < pivot) {
                realIndex++;
                swap(array, i, realIndex);
            }
        }
        swap(array, realIndex + 1, right);
        return realIndex + 1;
    }

}

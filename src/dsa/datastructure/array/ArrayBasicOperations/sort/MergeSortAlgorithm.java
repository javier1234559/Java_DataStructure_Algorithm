package dsa.datastructure.array.ArrayBasicOperations.sort;

import java.util.Arrays;

public class MergeSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        //MergeSort Algorithm implementation
        if (array.length <= 1) // stop recursion
            return;

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        left = Arrays.copyOfRange(array, 0, mid);
        right = Arrays.copyOfRange(array, mid, array.length);

        sort(left);
        sort(right);
        merge(array,left,right);

    }

    private void merge(int[] mergeArray, int[] leftArray, int[] rightArray) {
        //Merge two sorted array but still in ordered
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) { // if index of any subArray is overflow then break
            if (leftArray[i] < rightArray[j]) {
                mergeArray[k] = leftArray[i];
                i++;
            } else {
                mergeArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // To check if any subArray is still have element
        while (i < leftArray.length) {
            mergeArray[k] = leftArray[i];
            k++;
            i++;
        }

        while (j < rightArray.length) {
            mergeArray[k] = rightArray[j];
            k++;
            j++;
        }
    }
}

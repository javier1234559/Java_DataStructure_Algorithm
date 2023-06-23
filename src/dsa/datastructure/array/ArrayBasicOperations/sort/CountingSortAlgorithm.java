package dsa.datastructure.array.ArrayBasicOperations.sort;

import java.util.Arrays;

public class CountingSortAlgorithm implements SortAlgorithm {

    @Override
    public void sort(int[] array) {
        CountingSortSimple(array);
        CountingSortStable(array);
    }

    private void CountingSortSimple(int[] array) {
        int n = array.length;
        int max = Integer.MIN_VALUE; // Find MAX VALUE
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        int[] count = new int[max + 1]; //set all value in 0
        for (int i = 0; i < n; i++) {
            count[array[i]]++;  //increase frequency of number in count array
        }

        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < max + 1; i++) {  // loop all count
            while (count[i] > 0) {
                result[j] = i;
                j++;
                count[i]--;
            }
        }

        for (int i = 0; i < n; i++) {  //pass value to arr
            array[i] = result[i];
        }
    }

    private void CountingSortStable(int[] array) {
        int n = array.length;
        int max = Integer.MIN_VALUE; // Find MAX VALUE
        for (int i = 0; i < n; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        int[] count = new int[max + 1]; //set all value in 0
        for (int i = 0; i < n; i++) {
            count[array[i]]++;  //increase frequency of number in count array
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1]; //find cumulative frequency
        }

        // This loop will find the index of each element of the
        // original array in count array, and place the elements in output array
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[count[array[i]] - 1] = array[i];
            count[array[i]]--; // decrease count for same numbers
        }

        for (int i = 0; i < n; i++) {  //pass value to array
            array[i] = result[i];
        }
    }
}

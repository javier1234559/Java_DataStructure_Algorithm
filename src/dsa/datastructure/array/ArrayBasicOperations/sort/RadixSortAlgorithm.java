package dsa.datastructure.array.ArrayBasicOperations.sort;

import java.util.Arrays;

public class RadixSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        for(int exp = 1 ; max/exp > 0 ; exp*=10 ){
            CountingSortByExp(array,exp);
        }
    }

    private void CountingSortByExp(int[] array, int exp) {
        int[] result = new int[array.length + 1];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        for (int i = 0; i < max; ++i)
            count[i] = 0;

        // Calculate count of elements
        for (int i = 0; i < array.length; i++)
            count[getDigit(array[i],exp)]++;

        // Calculate cumulative count
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // exp the elements in sorted order
        for (int i = array.length - 1; i >= 0; i--) {
            result[count[getDigit(array[i],exp)] - 1] = array[i];
            count[getDigit(array[i],exp)]--;
        }

        for (int i = 0; i < array.length; i++)
            array[i] = result[i];
    }

    private int getDigit(int number, int exp) {
        return (number / exp) % 10;
    }
}

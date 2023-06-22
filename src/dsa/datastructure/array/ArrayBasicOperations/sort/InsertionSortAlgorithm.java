package dsa.datastructure.array.ArrayBasicOperations.sort;

public class InsertionSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        // Insertion Sort Algorithm implementation
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int temp = array[i]; //assign value to temp
            int j = i; // declare j for while loop

            while (j > 0 && temp < array[j - 1]) { // loop until array[j - i ] not larger than temp
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp; // assign value to behind number smaller than temp
        }
    }
}

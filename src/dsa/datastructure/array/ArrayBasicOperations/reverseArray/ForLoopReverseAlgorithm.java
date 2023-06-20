package dsa.datastructure.array.ArrayBasicOperations.reverseArray;

public class ForLoopReverseAlgorithm implements ReverseAlgorithm {
    @Override
    public void reverse(int[] array) {
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
    }
}

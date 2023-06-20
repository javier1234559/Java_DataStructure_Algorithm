package dsa.datastructure.array.ArrayBasicOperations.reverseArray;

public class WhileLoopReverseAlgorithm implements ReverseAlgorithm {
    @Override
    public void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

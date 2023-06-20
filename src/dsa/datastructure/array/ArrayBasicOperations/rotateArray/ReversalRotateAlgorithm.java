package dsa.datastructure.array.ArrayBasicOperations.rotateArray;

public class ReversalRotateAlgorithm implements RotateAlgorithm{
    @Override
    public void rotate(int[] array, int steps) {
        reverse(array, 0, array.length - 1);
        reverse(array, 0, steps - 1);
        reverse(array, steps, array.length - 1);
    }

    private void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

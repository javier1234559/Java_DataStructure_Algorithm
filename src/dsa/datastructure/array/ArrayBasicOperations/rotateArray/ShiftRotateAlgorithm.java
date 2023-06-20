package dsa.datastructure.array.ArrayBasicOperations.rotateArray;

public class ShiftRotateAlgorithm implements RotateAlgorithm {
    @Override
    public void rotate(int[] array, int steps) {
        for (int i = 0; i < steps; i++) {
            int first = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = first;
        }
    }
}

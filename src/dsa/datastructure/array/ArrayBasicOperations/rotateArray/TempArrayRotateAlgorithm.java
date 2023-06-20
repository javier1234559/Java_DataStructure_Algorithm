package dsa.datastructure.array.ArrayBasicOperations.rotateArray;

public class TempArrayRotateAlgorithm implements RotateAlgorithm  {
    @Override
    public void rotate(int[] array, int steps) {
        int[] tempArray = new int[array.length];
        steps = steps % array.length;
        for (int i = 0; i < array.length; i++) {
            tempArray[(i + steps) % array.length] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tempArray[i];
        }
    }
}

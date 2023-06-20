package dsa.datastructure.array.ArrayBasicOperations.rotateArray;

public class Rotate {
    private RotateAlgorithm algorithm;

    public Rotate(RotateAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void rotate(int[] array, int steps) {
        algorithm.rotate(array, steps);
    }
}

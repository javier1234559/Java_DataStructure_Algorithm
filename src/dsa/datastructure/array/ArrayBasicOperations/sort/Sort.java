package dsa.datastructure.array.ArrayBasicOperations.sort;


public class Sort {
    private SortAlgorithm algorithm;

    public Sort(SortAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(int[] array) {
        algorithm.sort(array);
    }
}

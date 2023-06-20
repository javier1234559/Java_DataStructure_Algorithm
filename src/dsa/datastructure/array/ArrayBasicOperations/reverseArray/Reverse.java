package dsa.datastructure.array.ArrayBasicOperations.reverseArray;

public class Reverse {
    private ReverseAlgorithm reverseAlgorithm;

    public Reverse(ReverseAlgorithm reverseAlgorithm) {
        this.reverseAlgorithm = reverseAlgorithm;
    }

    public void reverse(int[] array) {
        reverseAlgorithm.reverse(array);
    }
}

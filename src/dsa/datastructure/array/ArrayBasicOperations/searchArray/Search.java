package dsa.datastructure.array.ArrayBasicOperations.searchArray;

public class Search {
    private SearchAlgorithm algorithm;

    public Search(SearchAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int search(int[] array, int element) {
        return algorithm.search(array, element);
    }
}

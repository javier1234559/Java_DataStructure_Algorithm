package dsa.datastructure.array.ArrayBasicOperations.sortedArray;

import dsa.datastructure.array.ArrayBasicOperations.searchArray.BinarySearchAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.searchArray.LinearSearchAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.searchArray.Search;
import dsa.datastructure.array.ArrayBasicOperations.searchArray.SearchAlgorithm;

import java.util.Arrays;

public class SortedArray {
    int SIZE;
    int LENGTH;
    private int[] array;

    public SortedArray(int[] unsortedArray, int SIZE, int LENGTH) {
        this.array = unsortedArray;
        this.SIZE = SIZE;
        this.LENGTH = LENGTH;
    }

    public int search(int element) {
        // Binary Search Algorithm is popular for sorted array
        int low = 0, high = LENGTH - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public int insert(int element, int LENGTH) {
        this.LENGTH = LENGTH;
        if (LENGTH <= SIZE) {

            //Find the position to insert , it's value must be in order
            int index = 0;
            while (index < LENGTH && array[index] < element) {
                index++;
            }

            //Insert new element in order
            for (int i = this.LENGTH; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
            this.LENGTH++;
        }
        return this.LENGTH;
    }

    public int delete(int element, int LENGTH) { //delete in sorted array is like unsorted array
        this.LENGTH = LENGTH;
        int pos = search(element);
        while (pos != -1) {
            for (int i = pos; i < this.LENGTH - 1; i++) {
                array[i] = array[i + 1];
            }
            this.LENGTH = this.LENGTH - 1;
            pos = search(element);
        }
        return this.LENGTH;
    }

    public void modify(int oldElement, int newElement) {
        int index = search(oldElement);
        if (index != -1) {
            array[index] = newElement;
        } else {
            System.out.println("Element not found in the array.");
        }
    }

}

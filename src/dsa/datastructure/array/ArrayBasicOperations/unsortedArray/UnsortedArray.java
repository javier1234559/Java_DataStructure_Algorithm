package dsa.datastructure.array.ArrayBasicOperations.unsortedArray;

import dsa.datastructure.array.ArrayBasicOperations.searchArray.LinearSearchAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.searchArray.Search;
import dsa.datastructure.array.ArrayBasicOperations.searchArray.SearchAlgorithm;

import java.util.Arrays;

public class UnsortedArray {
    int SIZE;
    int LENGTH;
    private int[] array;

    public UnsortedArray(int[] unsortedArray) {
        array = unsortedArray;
    }

    public UnsortedArray(int[] unsortedArray, int SIZE, int LENGTH) {
        this.array = unsortedArray;
        this.SIZE = SIZE;
        this.LENGTH = LENGTH;
    }

    public int search(int element) {
        // Linear Search Algorithm is popular for unsorted array
        for (int i = 0; i < LENGTH; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int insert(int element, int LENGTH) {
        this.LENGTH = LENGTH;
        if (LENGTH <= SIZE) {
            //Insert at the end
            array[this.LENGTH++] = element;

            //Insert at the middle
            int middleIndex = LENGTH / 2;
            for (int i = this.LENGTH; i > middleIndex; i--) {
                array[i] = array[i - 1];
            }
            array[middleIndex] = element;
            this.LENGTH++;
        }
        return this.LENGTH;
    }

    public void insert(int element) { //Create new array and insert
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = element;
        array = newArray;
    }

    public int delete(int element, int LENGTH) {
        this.LENGTH = LENGTH ;
        int pos = search(element);
        while (pos != -1) { // change to while to delete all value
            for (int i = pos; i < this.LENGTH - 1; i++) {
                array[i] = array[i + 1]; // careful when access i + 1
            }
            this.LENGTH = this.LENGTH - 1;
            pos = search(element);
        }
        return this.LENGTH;
    }

    public void delete(int element) {
        int index = search(element);
        if (index != -1) {
            int[] newArray = new int[array.length - 1];
            int newIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[newIndex] = array[i];
                    newIndex++;
                }
            }
            array = newArray;
        } else {
            System.out.println("Element not found in the array.");
        }
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

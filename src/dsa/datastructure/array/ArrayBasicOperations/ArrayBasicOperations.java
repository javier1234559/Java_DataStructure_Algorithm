package dsa.datastructure.array.ArrayBasicOperations;

import dsa.datastructure.array.ArrayBasicOperations.sort.MergeSortAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.sort.QuickSortAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.sort.SelectionSortAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.sort.SortAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.sortedArray.SortedArray;
import dsa.datastructure.array.ArrayBasicOperations.unsortedArray.UnsortedArray;
import dsa.datastructure.array.ArrayBasicOperations.reverseArray.Reverse;
import dsa.datastructure.array.ArrayBasicOperations.reverseArray.ReverseAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.reverseArray.WhileLoopReverseAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.rotateArray.ReversalRotateAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.rotateArray.Rotate;
import dsa.datastructure.array.ArrayBasicOperations.rotateArray.RotateAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.searchArray.BinarySearchAlgorithm;
import dsa.datastructure.array.ArrayBasicOperations.searchArray.Search;
import dsa.datastructure.array.ArrayBasicOperations.searchArray.SearchAlgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayBasicOperations {
    static int[] array; // Global Data Structure
    static int SIZE;
    static int LENGTH;

    public static void main(String[] args) {
        SIZE = 10;
        LENGTH = 10;
        array = new int[SIZE];
//        Random rand = new Random();
        for (int i = 0; i < LENGTH; i++) {
            array[i] = 10 - i;
        }

//        System.out.println("1. Search in Array");
//        int searchElement = 5;
//        int searchIndex = searchInArray(searchElement);
//        System.out.println("Element " + searchElement + " found at index " + searchIndex);
//
//        System.out.println("2. Reverse the Array");
//        reverseArray();
//        System.out.println("Array after reversing: " + Arrays.toString(array));
//
//        System.out.println("3. Perform Array Rotations");
//        int rotationSteps = 2;
//        rotateArray(rotationSteps);
//        System.out.println("Array after rotating " + rotationSteps + " steps: " + Arrays.toString(array));

//        System.out.println("4. Search, Insert, and Delete in an Unsorted Array");
//        int unsortedElement = 100; //Special Number to be inserted
//        searchInsertDeleteUnsortedArray(unsortedElement);
//        System.out.println("Array after operations: " + Arrays.toString(array));

//        System.out.println("5. Search, Insert, and Delete in a Sorted Array");
//        int sortedElement = 100; //Special Number to be inserted
//        searchInsertDeleteSortedArray(sortedElement);
//        System.out.println("Array after operations: " + Arrays.toString(array));
//
        System.out.println("6. Sort the Array");
        sortArray();
        System.out.println("Array after sorting: " + Arrays.toString(array));
//
//        System.out.println("7. Generate all Subarrays");
//        generateAllSubarrays();

        System.out.println("Exiting program...");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }

    static int searchInArray(int element) {
        SearchAlgorithm algorithm = new BinarySearchAlgorithm();
        Search search = new Search(algorithm);
        return search.search(array, element);
    }

    static void reverseArray() {
        ReverseAlgorithm whileLoopAlgorithm = new WhileLoopReverseAlgorithm();
        Reverse whileLoopReverse = new Reverse(whileLoopAlgorithm);
        whileLoopReverse.reverse(array);
    }

    static void rotateArray(int steps) {
        RotateAlgorithm algorithm = new ReversalRotateAlgorithm();
        Rotate rotate = new Rotate(algorithm);
        rotate.rotate(array, steps);
    }

    static void searchInsertDeleteUnsortedArray(int element) {
        UnsortedArray unsortedArray = new UnsortedArray(array, SIZE, LENGTH);

        //Insert
        LENGTH = unsortedArray.insert(element, LENGTH);
        System.out.println(Arrays.toString(array));

        //DeLete Element
        LENGTH = unsortedArray.delete(element, LENGTH); //BUG: Infinite Delete Loop
        System.out.println(Arrays.toString(array));

        //Search
        System.out.println(unsortedArray.search(element));
    }

    static void searchInsertDeleteSortedArray(int element) {
        SortedArray sortedArray = new SortedArray(array, SIZE, LENGTH);

        //Insert
        LENGTH = sortedArray.insert(element, LENGTH);
        System.out.println(Arrays.toString(array));

        //DeLete Element
        LENGTH = sortedArray.delete(element, LENGTH); //BUG: Infinite Delete Loop
        System.out.println(Arrays.toString(array));

        //Search
        System.out.println(sortedArray.search(element));
    }

    static void sortArray() {

//        // Sắp xếp chọn (Selection Sort)
//        SortAlgorithm selectionSortAlgorithm = new SelectionSortAlgorithm();
//        selectionSortAlgorithm.sort(array);
//
//        // Sắp xếp nổi bọt (Bubble Sort)
//        SortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
//        bubbleSortAlgorithm.sort(arr);
//
//        // Sắp xếp chèn (Insertion Sort)
//        SortAlgorithm insertionSortAlgorithm = new InsertionSortAlgorithm();
//        insertionSortAlgorithm.sort(arr);
//
//        // Sắp xếp đếm (Counting Sort)
//        SortAlgorithm countingSortAlgorithm = new CountingSortAlgorithm();
//        countingSortAlgorithm.sort(arr);
//
//        // Sắp xếp trộn (Merge Sort)
//        SortAlgorithm mergeSortAlgorithm = new MergeSortAlgorithm();
//        mergeSortAlgorithm.sort(array);
//
        // Sắp xếp nhanh (Quick Sort)
        SortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
        quickSortAlgorithm.sort(array);
//
//        // Sắp xếp vun đống (Heap Sort)
//        SortAlgorithm heapSortAlgorithm = new HeapSortAlgorithm();
//        heapSortAlgorithm.sort(arr);
//
//        // Sắp xếp tân trọng (Radix Sort)
//        SortAlgorithm radixSortAlgorithm = new RadixSortAlgorithm();
//        radixSortAlgorithm.sort(arr);
//
//        // Sắp xếp cái (Bucket Sort)
//        SortAlgorithm bucketSortAlgorithm = new BucketSortAlgorithm();
//        bucketSortAlgorithm.sort(arr);

    }

    static void generateAllSubarrays() {
        // TODO: Implement this method
    }
}

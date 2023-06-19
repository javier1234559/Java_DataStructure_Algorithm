package dsa.datastructure.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasicOperations { //Format code Crt+Atl+ L
    static int[] array; // Global Data Structure
    static int SIZE;

    static void PreTestData() {
        array = new int[]{1, 2, 5, 4, 3};
        SIZE = array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PreTestData();
//        System.out.print("Enter the size of the array: ");
//        int size = scanner.nextInt();
//
//        array = new int[size];
//
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < size; i++) {
//            array[i] = scanner.nextInt();
//        }

        int choice;
        do {
            for (int i = 0; i < SIZE; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("\n-------- Array Operations Menu --------");
            System.out.println("1. Search in Array");
            System.out.println("2. Reverse the Array");
            System.out.println("3. Perform Array Rotations");
            System.out.println("4. Search, Insert, and Delete in an Unsorted Array");
            System.out.println("5. Search, Insert, and Delete in a Sorted Array");
            System.out.println("6. Sort the Array");
            System.out.println("7. Generate all Subarrays");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to search: ");
                    int searchElement = scanner.nextInt();
                    int index = searchInArray(searchElement);
                    if (index != -1) {
                        System.out.println("Element " + searchElement + " found at index " + index);
                    } else {
                        System.out.println("Element " + searchElement + " not found in the array");
                    }
                    break;

                case 2:
                    reverseArray();
                    System.out.println("Array after reversing: " + Arrays.toString(array));
                    break;

                case 3:
                    System.out.print("Enter the number of rotation steps: ");
                    int rotationSteps = scanner.nextInt();
                    rotateArray(rotationSteps);
                    System.out.println("Array after rotating " + rotationSteps + " steps: " + Arrays.toString(array));
                    break;

                case 4:
                    System.out.print("Enter the element to search, insert, or delete: ");
                    int unsortedElement = scanner.nextInt();
                    searchInsertDeleteUnsortedArray(unsortedElement);
                    System.out.println("Array after operations: " + Arrays.toString(array));
                    break;

                case 5:
                    System.out.print("Enter the element to search, insert, or delete: ");
                    int sortedElement = scanner.nextInt();
                    searchInsertDeleteSortedArray(sortedElement);
                    System.out.println("Array after operations: " + Arrays.toString(array));
                    break;

                case 6:
                    sortArray();
                    System.out.println("Array after sorting: " + Arrays.toString(array));
                    break;

                case 7:
                    generateAllSubarrays();
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    static int searchInArray(int element) {
//        //Linear Search Algorithm
//        for (int i = 0; i < SIZE; i++) { //O(n)
//            if (array[i] == element) {
//                return i;
//            }
//        }
//
//        //Sentinel Linear Search Algorithm
//        int last = array[SIZE - 1];
//        array[SIZE - 1] = element;
//        int i = 0;
//        while (array[i] != element) { //O(n)
//            i++;
//        }
//        array[SIZE - 1] = last;
//        if (i < SIZE - 1 || array[SIZE - 1] == element) {
//            return i;
//        }

        //Binary Search Algorithm
        //Array must be sorted
//        Arrays.sort(array); //O(n log n)
//        int low = 0, high = SIZE - 1;
//        while (low <= high) { //O(log n)
//            // use low + (high - low)/ 2 is better cuz can avoid overflow
//            int mid = (low + high) / 2;
//            if (array[mid] == element) {
//                return mid;
//            } else if (array[mid] < element) {
//                low = mid + 1;
//            } else if (array[mid] > element) {
//                high = mid - 1;
//            }
//        }

        //Recursive Binary Algorithm
        return recursiveBinarySearch(0, SIZE, element);

//        //Ternary Algorithm
//        int low = 0, high = SIZE - 1;
//        while (low <= high) {
//            int thirdPart = (high - low) / 3;
//            int mid1 = low + thirdPart;
//            int mid2 = high - thirdPart;
//
//            if (array[mid1] == element) {
//                return mid1;
//            } else if (array[mid2] == element) {
//                return mid2;
//            } else if (array[mid1] > element) {
//                high = mid1 - 1;
//            } else if (array[mid1] < element && array[mid2] > element) {
//                high = mid2 - 1;
//                low = mid1 + 1;
//            } else if (array[mid2] < element) {
//                low = mid2 + 1 ;
//            }
//        }
//        return -1;
    }

    static int recursiveBinarySearch(int low, int high, int element) {
        if (low <= high) { // not get over high
            int mid = (low + high) / 2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                return recursiveBinarySearch(mid + 1, high, element);
            } else if (array[mid] > element) {
                return recursiveBinarySearch(low, mid - 1, element);
            }
        }
        return -1;
    }

    static void reverseArray() {
        // Iterate Reverse
        for (int i = 0; i < SIZE / 2; i++) {
            int temp = array[i];
            array[i] = array[SIZE - 1 - i];
            array[SIZE - 1 - i] = temp;
        }
    }

    static void rotateArray(int steps) {
        // TODO: Implement this method
    }

    static void searchInsertDeleteUnsortedArray(int element) {
        // TODO: Implement this method
    }

    static void searchInsertDeleteSortedArray(int element) {
        // TODO: Implement this method
    }

    static void sortArray() {
        // TODO: Implement this method
    }

    static void generateAllSubarrays() {
        // TODO: Implement this method
    }
}

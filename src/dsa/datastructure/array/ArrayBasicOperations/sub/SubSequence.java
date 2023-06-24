package dsa.datastructure.array.ArrayBasicOperations.sub;

import static java.lang.Math.pow;

public class SubSequence {
    int[] array;
    int n;

    public SubSequence(int[] nums) {
        this.array = nums;
        this.n = nums.length;
    }

    public void printAllSubSequence() { //Using bit mask
        long sizeOfSubsequence = (long)Math.pow(2,n);  //2^k -1

        //Run from 000.. to 111..
        for(int i = 0 ; i < sizeOfSubsequence ; i++ ){
            for(int j = 0 ; j < n ; j ++){
                if((i & (1 << j)) > 0){ // Check if bit in counter is set then print it
                    System.out.print(array[j] + " ");
                }
            }
            System.out.println();
        }
    }
}

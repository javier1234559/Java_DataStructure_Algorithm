package dsa.datastructure.array.ArrayBasicOperations.sub;

public class SubArray {
    int[] array;
    int n;

    public SubArray(int[] nums) {
        this.array = nums;
        this.n = nums.length;
    }

    public void printAllSubArray() {
        for (int i = 0; i < n; i++) { //iterate all array and set start value
            for(int j = i ; j < n ; j++){ // iterate all array to set end value
                System.out.print("[");
                for(int k = i ; k <= j ; k++ ){
                    System.out.print(array[k] + " ");
                }
                System.out.print("]");
                System.out.println();
            }
        }
    }

}

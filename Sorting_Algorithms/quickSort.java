package Sorting_Algorithms;

/*
 * Heres a simple description of the algorithm O(n log(n)) :
 *      1.  Base case: If we have an array with one element, return it.
 *      2.  Guess that the 0th element of the array is the median
 *      3.  Seperate the array into 3 parts, containing all numbers below the 0th element, 
 *          one containing all the numbers equal to the 0th element, 
 *          and one containing all numbers above the 0th element. 
 *      4.  Recursively sort the half of numbers below the 0th element.
 *      5.  Recursively sort the half of numbers above the 0th element.
 *      6.  Concatenate the sorted lower array, the middle elements, and the sorted upper array.
 */


public class quickSort {
    public static void main(String[] args) {

    }

    public static int[] quickSort(int[] arr){
        // base case
        if(arr.length == 1) return arr;

        // assume oth index is pivot
        int pivot = arr[0];

        
        return null;
    }
}

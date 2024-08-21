package Sorting_Algorithms;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
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
        List<Integer> arr = Arrays.asList(3, 1, 4, 9, 7, 2);
        System.out.println(quickSort(arr));

    }

    public static List<Integer> quickSort(List<Integer> arr){
        // base case
        if(arr.size() <= 1) return arr;

        // assume oth index is pivot
        int pivot = arr.get(0);

        // seperate array into 3 parts
        List<Integer> lessThan = new ArrayList<Integer>();
        List<Integer> equalTo = new ArrayList<Integer>();
        List<Integer> greaterThan = new ArrayList<Integer>();

        for(int num : arr) {
            if(num > pivot) {
                greaterThan.add(num);
            }
            if(num < pivot) {
                lessThan.add(num);
            }
            if(num == pivot) {
                equalTo.add(num);
            }
        }

        // recursively sort lesser and greater parts
        List<Integer> sortedLessThan = quickSort(lessThan);
        List<Integer> sortedGreaterThan = quickSort(greaterThan);

        // concatenate sorted results
        List<Integer> result = new ArrayList<>();
        result.addAll(sortedLessThan);
        result.addAll(equalTo);
        result.addAll(sortedGreaterThan);

             
        return result;
    }
}

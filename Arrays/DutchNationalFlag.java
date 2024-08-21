
/*
 * This is a quicksort algorithm for recursively sorting arrays. It selects an element (the pivot), 
 * then reorders the array to make all elements less then or equal to the pivot appear first; followed 
 * by all the elements greater than the pivot. The 2 subarrays are then sorted recursively.
 * 
 * One of many implementations of this algorithm will make it so that theres large run times and deep 
 * function call stacks on arrays.
 * 
 * One solution is to reorder the array so that all elements less than the pivot appear first, 
 * followed by elements equal to the pivot, followed by elements greater than the pivot.
 * 
 * The Dutch National Flag problem deals with sorting 3 sections to resemble the dutch flag. 
 * For example: we can denote 0, 1, 2 to be three different colors of the flag.
 * The input defined can be something like : A = {0, 1, 0, 2, 1, 0, 2, 1, 2}
 * The output should be something like this: A = {0, 0, 0, 1, 1, 1, 2, 2, 2} 
 * The pivot in this case would be A[4] = 1
 * 
 * We should be able to write a program that takes an array, A and a index. It should rearrange 
 * the elements such thay all elements less than A[i] (the pivot) appears firt, followed by 
 * elements equal to the pivot, followed by elements greater than the pivot. 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class DutchNationalFlag {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(0, 1, 0, 1, 0, 1));
        // List<Integer> result = dutchNationalFlagInefficientApproach(arr);
        // System.out.println(result);
        // List<Integer> result = dutchNationalFlagMoreEfficientApproach(arr);
        // System.out.println(result);
        List<Integer> result = dutchFlagPartition(arr);
        System.out.println(result);
        
    }

    // O(n^2) time
    public static List<Integer> dutchNationalFlagInefficientApproach(List<Integer> arr) {

        // group elements smaller than the pivot
        int pivot  = arr.get(0);
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) < pivot) {
                    Collections.swap(arr, i, j);
                    break;
                }
            }
        }

        // group element larger than the pivot
        for(int i = arr.size() - 1; i >= 0; i--) {

            // stop when we reach an element less than the pivot
            for(int j = i - 1; j >= 0; j--) {
                if(arr.get(j) > pivot) {
                    Collections.swap(arr, i, j);
                    break;
                }
            }
        }
        return arr;
    }


    // In this approach we will only make a single pass and move all elements less than the pivot to the beginning of the list.
    // In the seconf pass, we move the larger elements to the end. 
    public static List<Integer> dutchNationalFlagMoreEfficientApproach(List<Integer> arr) {
        int pivot = arr.get(0);
        int smaller = 0;
        for(int i = 0; i < arr.size(); ++i) {
            if(arr.get(0) < pivot) {
                Collections.swap(arr, smaller++, i);
            }
        }

        // Second pass
        int larger = arr.size() - 1;
        for(int i = arr.size() - 1; i >= 0; --i) {
            if(arr.get(i) > pivot) {
                Collections.swap(arr, larger--, i);
            }
        }
        return arr;
    }


    public static List<Integer> dutchFlagPartition(List<Integer> arr) {
        int pivot = arr.get(0);
        int smaller = 0, equal = 0, larger = arr.size();
        while(equal < larger) {
            if(arr.get(equal) < pivot) {
                Collections.swap(arr, smaller++, equal++);
            } else if(arr.get(equal) == pivot) {
                ++equal;
            } else {
                Collections.swap(arr, equal, --larger);
            }
        }
        return arr;
    }



}


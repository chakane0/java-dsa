
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

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 2, 1, 2};
        int[] newArr = dutchNationalFlagApproach1(arr);
        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    // A = {0, 1, 0, 2, 1, 0, 2, 1, 2}
    public static int[] dutchNationalFlagApproach1(int[] arr) {
        // find pivot
        int pivot = arr.length/2;

        // get elemes smaller than pivot
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > pivot) {

                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // get elements larger than pivot
        for(int i = arr.length -1; i >= 0; i--) {
            for(int j = i-1; j >= 0; j--) {
                if(arr[i] > pivot) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = temp;
                    break;
                }
                
            } 
        }
        return arr;
    }


}
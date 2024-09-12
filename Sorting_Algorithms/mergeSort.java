package Sorting_Algorithms;

// mergeSort is a recursive sorting function where we split the array into 2 halves until each subarray contains only one element
// while merging, compare the elements of subarrays one by oone and arrange them in sorted order into a new array
import java.util.List;
import java.util.Arrays;
public class mergeSort {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] result = mergeSorted(nums1, 3, nums2, 3);
        for(int i : result) {
            System.out.print(i + ", ");
        }

        
    }
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    public static int[] mergeSorted(int[] nums1, int m, int[] nums2, int n) {
        int ptrA = 0, ptrB = 0;
        int aCount = 0;
        while(ptrA < (m+n) && ptrB < n) {
            // System.out.println("ptrA: "+ptrA+"\nptrB: "+ptrB+"\n--------");
            System.out.print("nums1: ");
            for(int i : nums1) {
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.print("nums2: ");
            for(int i : nums2) {
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("ptrA: "+ptrA+"\nptrB: "+ptrB+"\n--------");
            // if(aCount >= 3) {
            //     break;
            // } else {
            //     aCount++;
            // }
            if(nums1[ptrA]== 0) {
                System.out.println("zero seen here");
                nums1[ptrA] = nums2[ptrB];
                ptrA++;
                ptrB++;
            }
            else if(nums1[ptrA] > nums2[ptrB]) {
                System.out.println("ptrA>ptrB");
                int temp = nums1[ptrA];
                nums1[ptrA] = nums2[ptrB];
                nums2[ptrB] = temp;
                ptrA++;
            }
            else if(nums1[ptrA] <= nums2[ptrB]) {
                

                System.out.println("ptrA<=ptrB");
                System.out.println(nums1[ptrA]);
                System.out.println(nums2[ptrB]);
                ptrA++;
            }
            
        }
        
        return nums1;
    }
}
 
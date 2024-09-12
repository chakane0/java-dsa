import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Collection;

/*
 * Delete repeated elements from an array. 
 */
public class sortedArrayRemoveDups {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 4, 5, 6, 7, 8, 1, 9, 10));
        System.out.println(removeDuplicates(arr));

    }

    // use a hashmap to get unique values in O(n) time
    public static List<Integer> removeDuplicates(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for(int num : arr) {
            map.put(num, index++);
        }
        Collection<Integer> values = map.keySet();
        List<Integer> list = new ArrayList<>(values);
        return list;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/*
 * Wrtie a program what will take in an n amount of digits and add +1 to it.
 * For example:
 *      input: [1, 2, 3]
 *      output: [1, 2, 4]
 */
public class PlusOne {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>(Arrays.asList(9, 9, 9));
        List<Integer> result = plusOne(arr);
        System.out.println(result);


    }

    public static List<Integer> plusOne(List<Integer> arr) {
        // loop through numbers
        // if the last digit is 9, set to 0
        // if the digits range from 0-8, plus 1
        for(int i = arr.size() - 1; i >= 0; i--) {
            // System.out.print(arr.get(i));  321
            if(arr.get(i) == 9) {
                arr.set(i, 0);
            } else if(arr.get(i) >= 0 && arr.get(i) <= 8) {
                arr.set(i, arr.get(i)+1);
                break;
            }
            
        }
        return arr;
    }
}

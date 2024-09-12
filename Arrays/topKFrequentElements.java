import java.util.HashMap;
import java.util.PriorityQueue;
public class topKFrequentElements {
    

    public static void main(String[] args) {
        
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], null)
        }
    }
    
}

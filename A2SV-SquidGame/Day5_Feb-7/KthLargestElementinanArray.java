import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // use minHeap of k elements
	    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    for(int num : nums){
		    if(minHeap.size() <k){
			    minHeap.add(num);
            }
            else{
	            if(minHeap.peek() < num){
		            minHeap.remove();
		            minHeap.add(num);
                }
            }

        }
        return minHeap.peek();

    }
}
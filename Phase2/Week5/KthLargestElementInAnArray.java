 public class KthLargestElementInAnArray{
 	public static void main(String[] args) {
 		
 	}
 }

 class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<nums.length;i++){
            if(minHeap.size() < k){
                minHeap.add(nums[i]);
            }
            else{
                if(nums[i] > minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
            }
        }
        return minHeap.peek();
    }
}
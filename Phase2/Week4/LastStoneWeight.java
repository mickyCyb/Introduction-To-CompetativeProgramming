public class LastStoneWeight{
	public static void main(String[] args) {
		
	}
}

class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>( (a,b) -> b.compareTo(a));
        if(stones.length == 0){
            return 0;
        }
        if(stones.length == 1){
            return stones[0];
        }
        
        for(int stone : stones){
            maxHeap.add(stone);
        }
        
        while(!maxHeap.isEmpty()){
            int size = maxHeap.size();
            if(size ==1){
                return maxHeap.poll();
            }
            else if(size==0){
                return 0;
            }
            maxHeap.add(maxHeap.poll() - maxHeap.poll());
        }
        return 0;
    }
}
class Solution {
    public int maxArea(int[] height) {
        // using two pointers starting left and right O(n) runtime, O(1) space
        int front = 0;
        int last = height.length -1;
        int max = Integer.MIN_VALUE;
        
        while(front < last){
            int min = Math.min(height[front], height[last]); // because if we choose the bigger one the water will flow out
            max = Math.max(max, min * (last - front));      // the lower boundary limits the water it can carry. 
            if(height[front] < height[last]){ // look for the next big vertical line from both sides
                front++;
            }
            else{
                last --;
            }
        }
        return max;
    }
}
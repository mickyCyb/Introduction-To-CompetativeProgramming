class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>( (a,b) -> a[0] - b[0]);
        
        for(int i=0; i< points.length; i++){
            maxHeap.add (new int[]{ points[i][0] * points[i][0] + points[i][1] * points[i][1], 
                        points[i][0],points[i][1] });
        }
        
        int[][] closest = new int [K][2];
        
        int i=0;
        
        while(i < K){
            int[] closePoint = maxHeap.poll();
            closest[i][0] = closePoint[1];
            closest[i][1] = closePoint[2];
            i++;
        }
        return closest;
        
    }
}
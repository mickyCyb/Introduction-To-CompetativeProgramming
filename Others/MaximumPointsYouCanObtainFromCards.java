class Solution {
    public int maxScore(int[] cardPoints, int k) {
     
        int front = 0;
        int last = cardPoints.length -1;
        int frontSum = 0;
        int backSum = 0;
        int max = 0;
        
        for(int i=0; i < k; i++){
            frontSum += cardPoints[i];
        }
        max = Math.max(max,frontSum);
        int y=k-1;
        for(int i=0; i < k; i++){
            frontSum -= cardPoints[y--];
            backSum += cardPoints[last--];
            max = Math.max(max,frontSum + backSum);
        }
        return max;
    }
}
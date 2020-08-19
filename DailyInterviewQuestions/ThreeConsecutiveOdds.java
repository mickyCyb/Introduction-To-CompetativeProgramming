class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        int consecutiveCount = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                consecutiveCount++;
                if(consecutiveCount ==3){
                    return true;
                }    
            }
            else{
                consecutiveCount = 0;
            }
        }
        return false;
    }
}
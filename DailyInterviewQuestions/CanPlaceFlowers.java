public class CanPlaceFlowers{
    public static void main(String[] args) {
        SolutionCanPlaceFlowers placeFlowers = new SolutionCanPlaceFlowers();
        boolean ans = placeFlowers.canPlaceFlowers(new int []{1,0,0,0,1,0,0},2);
        System.out.println(ans);
    }
}
class SolutionCanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
     
        
        int prevIndex=0;
        int postIndex=0;
        
        for(int i=0; i<flowerbed.length; i++){
            
            if(i-1 < 0){  // check for boundary at the start
                prevIndex = i;      
            }else{
                prevIndex = i-1;
            }
            
            if(i+1 > flowerbed.length-1){
                postIndex = i;
            }
            else{
                postIndex = i+1;
            }
            
            // check if the number itself, the previous number and the number after
            // are 0 so that we have possible move
            if(flowerbed[i] ==0 && flowerbed[prevIndex] ==0 && flowerbed[postIndex] ==0){
                flowerbed[i] = 1;
                n--;    // to be true n must be zero (or less)
            }
        }
        return n<=0;
    }
}

// [0,0,0,0,0]
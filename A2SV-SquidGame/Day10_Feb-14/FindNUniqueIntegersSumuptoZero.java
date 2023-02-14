public class FindNUniqueIntegersSumuptoZero {
    
}
class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n];
            
            int counter = 0;
            for(int i = 1; i <= n/2; i++){
                arr[counter++] = -1*(i);
                arr[counter++] = i;
            }
        return arr;
    }
}
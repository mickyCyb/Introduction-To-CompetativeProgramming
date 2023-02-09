public class MaximumSwap {
    
}
class Solution {
    public int maximumSwap(int num) {
        if(num < 10) return num;
        
        char[] arr = String.valueOf(num).toCharArray();
        
        int[] rightIndex = new int[10];  
        for(int i=0; i<arr.length; i++){
            rightIndex[arr[i] - '0'] = i;
        }
        // System.out.println(Arrays.toString(rightIndex));
        for(int i=0; i<arr.length; i++){
            for(int j=9; j>arr[i] - '0'; j--){
                if(rightIndex[j] > i){ 
                    char temp = arr[i];
                    arr[i] = arr[rightIndex[j]];
                    arr[rightIndex[j]] = temp;
                    return Integer.valueOf(new String(arr));
                }
            }
        }
        return num;
    }
}
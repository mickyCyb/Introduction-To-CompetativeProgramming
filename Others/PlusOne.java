class Solution {
    public int[] plusOne(int[] digits) {
        
        int i = digits.length -1;
        
        while(i>=0){
            if(digits[i] < 9){
                digits[i]+=1;
                break;
            }            
            else if(digits[i] >= 9 && i != 0){
                digits[i] = 0;
            }
            else if(digits[i] >= 9 && i == 0){
                digits[i] += 1;
            }
            
            i--;
        }
        int[] arr = new int[digits.length+1];
        if(digits[0] > 9){
            arr[0] = 1;
            int j =1;
            for(j = 1; j < i;j++){
                arr[j] = digits[j-1];
            }
            return arr;
        }
        return digits;
    }
}
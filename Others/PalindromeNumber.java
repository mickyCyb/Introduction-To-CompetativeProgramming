class Solution {
    public boolean isPalindrome(int x) {
        
        int num =x;
        if(num < 0 || (num % 10 ==0 && num != 0)){
            return false;
        }

        int y =0;
       
        while(num!=0){
            int rem = num % 10;
            num = num / 10;
            y = y*10 + rem;
        }
        return x == y;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max=0;
        int pointer1=0;
        int pointer2=0;
        
        while(pointer2 < s.length()){
            if(!set.contains(s.charAt(pointer2))){
                set.add(s.charAt(pointer2));
                pointer2++;
            }else{
                
                set.remove(s.charAt(pointer1));
                pointer1++;
             
            }
            
            max = Math.max(max,pointer2 - pointer1);
        }
        return max;
    }
}
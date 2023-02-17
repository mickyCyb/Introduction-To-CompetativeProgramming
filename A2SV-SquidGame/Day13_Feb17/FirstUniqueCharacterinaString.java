
public class FirstUniqueCharacterinaString {
    
}
class Solution {
    public int firstUniqChar(String s) {
        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(letters[ch - 'a'] != 0){
                letters[ch - 'a'] = -1;
            }else{
                letters[ch - 'a'] = i + 1;
            }
        }
        int index = Integer.MAX_VALUE;
        for(int num : letters){
            if(num > 0){
                index = Math.min(index, num-1);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }
}
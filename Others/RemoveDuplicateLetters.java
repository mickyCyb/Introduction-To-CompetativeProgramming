public class RemoveDuplicateLetters{
	public static void main(String[] args) {
		
	}
}

// since we need lexicographical orderof the string, we need to remove letters from the result string(string builder) if the incoming 
// character is greater than the last character from the result string and has morethan 1 occurence in the string
class Solution {
    public String removeDuplicateLetters(String s) {
        
        int[] letters = new int[26];
        StringBuilder builder = new StringBuilder();
        
        for(char ch : s.toCharArray()){
            letters[ ch - 'a']++;
        }
        boolean[] taken = new boolean[26];
        builder.append('0'); // as a starter, to comapre the other characters
        
        for(char ch : s.toCharArray()){
            letters[ ch - 'a']--;
            if(!taken[ ch - 'a']){
                while(builder.charAt(builder.length() -1) > ch && letters[builder.charAt(builder.length()-1)- 'a'] > 0){
                    taken[builder.charAt(builder.length() - 1) - 'a'] = false;
                    builder.deleteCharAt(builder.length()-1);
                    
                }
                builder.append(ch);
                taken[ch -'a']= true;
            }
        }
        return builder.substring(1).toString();
    }
}
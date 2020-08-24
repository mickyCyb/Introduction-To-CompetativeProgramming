import java.util.*;

public class FindWordsThatCanBeFormedByCharacters{
    public static void main(String [] args ){
        Solution solution = new Solution();
        int ans = solution.countCharacters(new String[]{"cat","bt","hat","tree"}, "atach");
        System.out.println(ans);
    }
}


class Solution {
    public int countCharacters(String[] words, String chars) {
     
        
         // ** Solution using two HashMap //
        
/**        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<chars.length(); i++){
            if(!map.containsKey(chars.charAt(i))){
                map.put(chars.charAt(i),1);
            }
            else{
                map.put(chars.charAt(i), map.get(chars.charAt(i))+1);
            }
        }
        // for(char c : map.keySet()){
        //     System.out.println(c + " " + map.get(c));
        // }
        
        int sum=0;
        int tempSum=0;
        int count;
        for(String str : words){
            HashMap<Character,Integer> map2 = new HashMap<>();
            map2 = (HashMap) map.clone();
            
            count =0;
            for(int i=0; i<str.length();i++){
                char ch = str.charAt(i);
                
               // System.out.println(map.get(ch) + "" +ch);
                if(map2.containsKey(ch) && map2.get(ch) >0){
                    map2.put(ch, (map2.get(ch) -1));
                    count++;
                }
                if(count == str.length()){
                    sum+=count;
                }
               
            }
            
        }
        return sum;    
**/
        
        // ** solution using count Array //
        int[] countArr = new int[26];
        
        for(char ch : chars.toCharArray()){
            countArr[ch - 'a']++;
        }
        
        int sum=0;
        int count;
        for(String word : words){
            int [] countArrCopy = Arrays.copyOf(countArr, countArr.length);
            count=0;
            for(char c : word.toCharArray()){
                if(countArrCopy[c -'a'] > 0){
                    count++;
                    countArrCopy[c -'a'] --;
                }
                if(count == word.length()){
                    sum+=count;
                }
            }
        }
        return sum;
    }
}
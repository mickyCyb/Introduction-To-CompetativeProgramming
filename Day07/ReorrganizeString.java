/**
 * ReorrganizeString
 */
import java.util.*;
public class ReorrganizeString {

    public static void main(String[] args) {
        SolutionReorrganizeString sol = new SolutionReorrganizeString();
        System.out.println(sol.reorganizeString("aab"));
    }
}

class SolutionReorrganizeString {
    public String reorganizeString(String S) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // create and use HashMap to put the caharacter with ther frequencies
        for(int i=0;i<S.length(); i++){
            if(!map.containsKey(S.charAt(i))){
                map.put(S.charAt(i),1);
            }
            else{
                map.put( S.charAt(i), map.get(S.charAt(i)) +1 );
            } 
        }
        
        // create and use PriorityQueue to get top 2 frequent characters
        // and add them to the final string side by side
        //repeat this step 
        
        PriorityQueue<Character> maxHeap = new PriorityQueue<>( (a,b) -> map.get(b) - map.get(a));
        // add all the HashMap keys in to the PriorityQueue
        maxHeap.addAll(map.keySet());
        
        StringBuilder builder = new StringBuilder(); 
        // 2 or more characters are needed to go in to the loop
        while( maxHeap.size() > 1){
            // remove the 2 most most frequent characters and add them adjacently
            char currentChar = maxHeap.remove();
            char nextCurrentChar= maxHeap.remove();
            
            builder.append(currentChar);
            builder.append(nextCurrentChar);
            
            //since there could be multiple occurence of a character add them back to the HashMap
            map.put(currentChar, map.get(currentChar) - 1 );
            map.put(nextCurrentChar, map.get(nextCurrentChar) - 1 );
            
            // //since there could be multiple occurence of a character add them back to the heap
            if(map.get(currentChar) > 0){
                maxHeap.add(currentChar);
            }  
            if(map.get(nextCurrentChar) > 0){
                maxHeap.add(nextCurrentChar);
            }
        }
        if(!maxHeap.isEmpty()){
            char remainingCharacter = maxHeap.remove();
            
            // if the last character has multiple occurences there is no way to add them 
            // to the result without putting adjacently
            if(map.get(remainingCharacter) > 1){
                return "";
            }
            builder.append(remainingCharacter);
        }
        return builder.toString();
        
    }
}

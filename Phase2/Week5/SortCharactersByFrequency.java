public class SortCharactersByFrequency{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for(int i=0;i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }
            else{
                map.put( s.charAt(i), map.get(s.charAt(i)) +1 );
            } 
        }
        maxHeap.addAll(map.keySet());
        
        StringBuilder builder = new StringBuilder();
        while(maxHeap.size() >0){
            char ch = maxHeap.remove();
            int len = map.get(ch);
            while(len > 0){
                builder.append(ch);
                len--;
            }
        }
        return builder.toString();
    }
}
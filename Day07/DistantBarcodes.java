import java.util.*;

public class DistantBarcodes{
    public static void main(String[] args) {
        SolutionDistantBarcodes barcodes = new SolutionDistantBarcodes();
        int[] ans =barcodes.rearrangeBarcodes(new int[]{1,1,1,2,2,2});
        System.out.println(Arrays.toString(ans));
    }
}

class SolutionDistantBarcodes {
    public int[] rearrangeBarcodes(int[] barcodes) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] resultBarcodes = new int[barcodes.length];
        
        // add the numbers from the array to the hashmap with their frequancies
        for(int n : barcodes){
            if(!map.containsKey(n)){
                map.put(n,1);
            }
            else{
                map.put(n, map.get(n) +1);
            }
        }
        
        // a maxheap to identify the most frequent element in the array
        PriorityQueue <Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));    
        // add the elements from the hashmap to the maxhheap,using their keys
        maxHeap.addAll(map.keySet());
        
        int index=0;    // varibale to keep track of the position in the result array
        while(!maxHeap.isEmpty()){
            int bar = maxHeap.poll();
            int frequency = map.get(bar);
            
            while(frequency > 0){
                resultBarcodes[index] = bar;
                
                if(index+2 >= barcodes.length){    // checlk if the index we want to put the next
                    index = 1;                  // frequent number isn't out of bound      
                }
                else{
                    index+=2;
                }
                frequency--;
            }
            
        }
        return resultBarcodes;
    }
}
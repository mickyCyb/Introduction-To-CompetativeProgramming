/**
 * TopKFrequentElements
 */
import java.util.*;
public class TopKFrequentElements {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

class SolutionTopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
     
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<PairItems> maxHeap = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) +1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for(int n : map.keySet() ){
            int key = (int)n;
            int val = (int)map.get(n); 
            PairItems pairs = new PairItems(key, val);
            maxHeap.add(pairs);
        }

        for(int i=0; i < k; i++){
            PairItems p = maxHeap.poll();
            list.add(p.value);
        }
        
        

        return list;
    }
}

class PairItems{
    int value;
    int frequency;

    public PairItems(int val, int freq){
        this.value = val;
        this.frequency = freq;
    }
}


class maxHeapComparator implements Comparator<PairItems>{

    @Override
    public int compare(PairItems o1, PairItems o2) {
        // TODO Auto-generated method stub

        if(o1.frequency< o2.frequency){
            return 1;
        }
        else if(o1.frequency > o2.frequency){
            return -1;
        }

        return 0;
    }




    // shorter solution

    // int[] result = new int[k];
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     PriorityQueue<Integer> maxHeap = new PriorityQueue<>( (a,b) -> map.get(b)-map.get(a));
        
    //     for(int i=0; i < nums.length; i++){
    //         if(map.containsKey(nums[i])){
    //             map.put(nums[i], map.get(nums[i]) +1);
    //         }
    //         else{
    //             map.put(nums[i], 1);
    //         }
    //     }
        
    //     maxHeap.addAll(map.keySet());
    //     for(int i = k - 1; i >= 0; --i)
    //         result[i] = maxHeap.poll();
        
    //     return result;

}
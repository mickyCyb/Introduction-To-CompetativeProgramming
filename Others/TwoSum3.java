/**
 * TwoSum3
 */
// Two Sum III – Data structure design (Java)
 

import java.util.*;
public class TwoSum3 {

    public static void main(String[] args) {
        TwoSumIII twoSumIII = new TwoSumIII();
        twoSumIII.add(1);
        twoSumIII.add(2);
        twoSumIII.add(3);
        twoSumIII.add(5);
        twoSumIII.add(7);
        twoSumIII.add(8);
        twoSumIII.add(9);
        boolean ans = twoSumIII.find(15);
        System.out.println(ans);
    }
}

class TwoSumIII{

    HashMap<Integer,Integer> map = new HashMap<>();
    public void add(int num){
        if(!map.containsKey(num)){
            map.put(num,1);
        }
        else{
            map.put(num,map.get(num)+1);
        }
    }

    public boolean find(int num){

        for(int n: map.keySet()){
            if(map.containsKey(num - n)){

                if(n == num -n && map.get(num -n) <=1){
                    continue;
                }
                return true;
            }
        }

        return false;
    }

}
import java.util.*;

/**
 * NumberOfEquivalentDominoPairs
 */
public class NumberOfEquivalentDominoPairs {

    public static void main(String[] args) {
        
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        String s= Integer.toString(arr[0][0])  + Integer.toString(arr[0][1]);
        Integer.parseInt(s);
        int t=Integer.parseInt(s);
        System.out.println(t);
    }
}

class SolutionDomino {
    public int numEquivDominoPairs(int[][] dominoes) {
     
        int pairs =0;
        String s ="";
        int[] arr = new int[dominoes.length];
        int t;

        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0; i<dominoes.length; i++){
            Arrays.sort(dominoes[i]);
            
            s= Integer.toString(dominoes[i][0])  + Integer.toString(dominoes[i][1]);
            t = Integer.parseInt(s);

            if(!map.containsKey(t)){
                map.put(t, 1);
            }
            else{
                pairs+= map.get(t);
                map.put(t,map.get(t)+1);
              
            }
        }
        
        return pairs; 
    }
}
import java.util.Arrays;
import java.util.HashMap;

/**
 * ReduceArraySizeToTheHalf
 */
public class ReduceArraySizeToTheHalf {

    public static void main(String[] args) {

        SolutionReduceArraySizeToTheHalf red = new SolutionReduceArraySizeToTheHalf();
        int ans = red.minSetSize(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(ans);
    }
}

class SolutionReduceArraySizeToTheHalf {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        Object[] array = map.values().toArray();
        
        Arrays.sort(array);

        int count =0;
        int ans=0;
        for (int i = array.length - 1; i >= 0; i--) {
            if(count >= arr.length / 2){
                return ans;
            }

            count += (int) array[i];
            ans++;
        }

        
        return ans;
    }
}
/**
 * ContainsDuplicateII
 */
import java.util.*;
public class ContainsDuplicateII {

    public static void main(String[] args) {
        
        SolutionContainsDuplicate solutionContainsDuplicate = new SolutionContainsDuplicate();
        boolean ans = solutionContainsDuplicate.containsNearbyDuplicate(new int []{1,2,3,1}, 3);
        System.out.println(ans);
    }
}

class SolutionContainsDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
        HashMap <Integer , Integer> myHash = new HashMap<>();
        int currentIndex;

        for(int i=0; i<nums.length; i++){

            // check if for duplicate key and if found compare it with the previous one's value
            if(myHash.containsKey(nums[i])){
                currentIndex = myHash.get(nums[i]);

                if(Math.abs(currentIndex - i) <=k){
                   return true; 
                }
            }

            // if there is no duplication the numbers from the array are added here.
            myHash.put(nums[i], i);
        }

        return false;
    }
}
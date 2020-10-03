public class CombinationSum{
    public static void main(String[] args) {
        
    }
}

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        //sort the array to make backtracking easier
        Arrays.sort(candidates);
        List<Integer>combinations =  new ArrayList<Integer>();
        findAllCombinationSum(result,candidates, combinations,target,0);
        return result;
    }
    public void findAllCombinationSum(List<List<Integer>>result,int[]candidates, List<Integer> combinations, int target, int startIndex){
        if(target ==0){
            result.add(new ArrayList<>(combinations));
            return;
        }
        
        for(int i = startIndex; i<candidates.length;i++){
            if(candidates[i] > target){
                break;
            }
            combinations.add(candidates[i]);
            findAllCombinationSum(result,candidates,combinations, target - candidates[i],i);
            combinations.remove(combinations.size()-1);
        }
    }
}
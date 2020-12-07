class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        
        subsets.add(new ArrayList<>(current));
        generateSubsets(0, nums, current, subsets);
        
        return subsets;
    }
    
    public void generateSubsets(int index, int[]nums, List<Integer> current, List<List<Integer>> subsets){
        if(index >= nums.length){
            return;
        }
        
        current.add(nums[index]);
        subsets.add(new ArrayList<>(current));
        generateSubsets(index+1, nums,current,subsets);
        current.remove(current.size()-1);
        generateSubsets(index+1,nums, current, subsets);
        
    }
}
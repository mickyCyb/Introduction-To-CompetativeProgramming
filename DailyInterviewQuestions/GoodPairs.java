public GoodPairs{
	public static void main(String[] args) {
		
	}
}

class SolutionGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        
        int[] countArr = new int[101];
        int goodPairs=0;
        
        for(int num : nums){
            countArr[num]++;
        }
        for(int pair : countArr){
            if(pair > 1){   // since 1 number can't make a pair
                goodPairs += (pair -1 ) * pair/2; // formaula derived from repeated calculation
            }
        }
        
        return goodPairs;
        
    }
}
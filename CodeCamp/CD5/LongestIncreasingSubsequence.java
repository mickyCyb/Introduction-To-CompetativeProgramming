/**
 * LongestIncreasingSubsequence
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        SolutionLongestIncreasingSubsequence LIS = new SolutionLongestIncreasingSubsequence();
        int ans = LIS.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18});
        System.out.println(ans);
    }
}

class SolutionLongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        
        int [] memo = new int[nums.length];
        int max=0;
        int tempMax;
        memo[nums.length - 1] =1;

        for(int i=nums.length - 1;i>=0; i--){

            tempMax =0;
            for(int j = i + 1; j< nums.length; j++ ){
                if(nums[i] < nums[j] && memo[i] > tempMax){
                    tempMax =memo[j];
                }

            }
            memo[i] = tempMax + 1;
            max = Math.max(memo[i], tempMax);

        }

        return max;
    }
}
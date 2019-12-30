package com.company;

// Question from leetcode 'twonums'
class SolutionTwoNum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length;i++){

            for (int j = 0; j < nums.length; j++) {

                if (i!=j && nums[i] + nums[j] == target){

                    return new int[]{i, j};
                }
            }
        }
        return new int[]{3,5};

    }

/*         --Test data--
            input  -> [2,7,11,15]
            output -> 9
*/
}
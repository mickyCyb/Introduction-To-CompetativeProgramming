package com.company;

public class SortColors {
    public static void main(String[] args) {

        SolutionSortColors solutionSortColors = new SolutionSortColors();

        int [] colorSort = new int[]{2,0,2,1,1,0};
        solutionSortColors.sortColors(colorSort);

        for(int i=0; i<colorSort.length; i++){
            System.out.print(colorSort[i]);        //Expected Output: [0,0,1,1,2,2]
        }
    }
}


class SolutionSortColors {
    public void sortColors(int[] nums) {

    // Input: [2,0,2,1,1,0]
    // Output: [0,0,1,1,2,2]

        if(nums.length<=1){
            return;
        }

        int frontIndex =0;  // 
        int lastIndex = nums.length-1;
        int currentIndex =0;

        while(frontIndex < lastIndex && currentIndex <= lastIndex){
            if(nums[currentIndex] ==0){ // if the current element is 0, put it at the front.
                nums[currentIndex] = nums[frontIndex];
                nums[frontIndex] =0;
                frontIndex++;
                currentIndex++;

            }
            else if(nums[currentIndex] == 2){   //if the current element is 2, put it at the back
                nums[currentIndex] = nums[lastIndex];
                nums[lastIndex] =2;
                lastIndex--;
            }
            else{
                currentIndex++;
            }

        }

    }
}

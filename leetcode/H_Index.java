package com.company;

import java.util.Arrays;
import java.util.Collections;

public class H_Index {
    public static void main(String[] args) {

        SolutionH_Index solutionH_index = new SolutionH_Index();
        int ans = solutionH_index.hIndex(new int[]{3,0,6,1,5});

        System.out.println(ans);
    }
}

class SolutionH_Index {
    public int hIndex(int[] citations) {

        int hIndex =0;
        int [] reverseList = new int[citations.length]; // an array to hold the reverse list.

        Arrays.sort(citations); // sort the array in ascending order.

        int j=0;
        for(int i=citations.length-1; i>=0; i--){   // reverse the array and put it in another list
            reverseList[j] = citations[i];
            j++;
        }

        for(int i =0; i<reverseList.length; i++){

            if(reverseList[i] >= i+1 && reverseList[i] != 0 ){  // check if the conditions are met for an H-Index
                hIndex = i+1;
            }
        }
        return hIndex;
    }
}

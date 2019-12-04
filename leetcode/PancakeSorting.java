package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PancakeSorting {
    public static void main(String[] args) {

        SolutionPancakeSorting spcs = new SolutionPancakeSorting();
        System.out.println(spcs.pancakeSort(new int[]{2,7,1,9,5}));
    }
}

class SolutionPancakeSorting {
    public List<Integer> pancakeSort(int[] A) {

        ArrayList<Integer> flippedArray = new ArrayList<>();

        int count=0;
        while(count<A.length-1){
            if(getMax(A,A.length -count) == 0){
                flippedArray.add(flip2(A,A.length-1 -count));
            }
            else {
                flippedArray.add(flip(A, A.length - count));
                flippedArray.add(flip2(A, A.length-1 - count));
            }
            count++;
        }
        return flippedArray;

    }

    // a function to get the the maximum of the list
    public static int getMax(int []A,int index){

        int max=0;

        for(int i =1;i<index;i++){

            if(A[max]<A[i]){
                max=i;
            }
        }
        return max;
    }
    // a function that flips the biggest number to the first index
    public static int flip(int[]A, int index){

            int var = getMax(A,index);

            for(int j=0;j<(var+1)/2; j++){
                int temp = A[var-j];
                A[var-j] = A[j];
                A[j] = temp;
            }

        return var+1;

    }

    // a function that puts the biggest number to the back of the array
    public static int flip2(int[] A, int index){

        for(int j=0;j<(index+1)/2; j++){
            int temp = A[index-j];
            A[index-j] = A[j];
            A[j] = temp;
        }

        return index+1;

    }

}

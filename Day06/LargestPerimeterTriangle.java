package com.company;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        SolutionLargePerimterTriangle slpt = new SolutionLargePerimterTriangle();
       int x= slpt.largestPerimeter(new int[]{1,2,1});
        System.out.println("final " + x);
    }
}

class SolutionLargePerimterTriangle {

    public int largestPerimeter(int[] A) {

        // A =[1,2,4] =>7

        int perimeter=0;
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
        }
        int ele = A.length - 1;

        for(int i = ele; i >= 2 ; i--){

                if ((A[i - 1] + A[i - 2]) > A[i]) {
                    perimeter = A[i] + A[i - 1] + A[i - 2];
                    return perimeter;
                }
        }
    return perimeter;
    }

}
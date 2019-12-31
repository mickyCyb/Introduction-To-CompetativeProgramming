package com.company;

public class SortArrayByParity2{
    public static void main(String[] args) {


        // Assuming the given array consists of half odd and half even numbers.
        // Also works with an array with big size (2000)
        int[] A = { 2, 8, 3, 7 };
        int[] sortedByParity = new Solution().sortArrayByParityII(A);

        System.out.print("[");
        for (int i : sortedByParity) {
        System.out.print(i + ",");
        }
        System.out.print("]");
    }
}

class Solution {
    public int[] sortArrayByParityII(int[] A) {

        int len = A.length;
        int evenIndex = 0;
        int oddIndex = 1;

        int[] sortedList = new int[len];

        // check if the number at the given index is even
        for(int i=0; i<A.length; i++){
            if(A[i]%2 ==0){
                sortedList[evenIndex] = A[i];
                evenIndex+=2;
            }
            // check if the number at the given index is odd
            else if(A[i]%2 !=0){
                sortedList[oddIndex] = A[i];
                oddIndex+=2;
            }
        }
        return sortedList;
    }

}

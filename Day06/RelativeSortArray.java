package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class RelativeSortArray {
    public static void main(String[] args) {
        SolutionRelativeSortArray slsr  = new SolutionRelativeSortArray();
        int [] finalList = slsr.relativeSortArray(new int[]{}, new int[]{});
        for(int i=0;i<finalList.length; i++){
            System.out.print(finalList[i]);
            System.out.print(",");

        }
       // System.out.println(slsr.relativeSortArray(new int[]{2,3,1,3,2,4,6,7,9,2,19}, new int[]{2,1,4,3,9,6}));
    }
}


class SolutionRelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // arr1   = [2,3,1,3,2,4,6,7,9,2,19]
        // arr2   = [2,1,4,3,9,6]
        // output = [2,2,2,1,4,3,3,9,6,7,19]

        ArrayList<Integer> arrList1 = new ArrayList<>();
        ArrayList<Integer> unCommon = new ArrayList<>();

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length; j++){
                if(arr1[j] == arr2[i]){
                    arrList1.add(arr1[j]);

                }
            }
        }

        for(int i=0;i<arr1.length;i++){
            if(!arrList1.contains(arr1[i])){
                unCommon.add(arr1[i]);
            }
        }
        Collections.sort(unCommon);
        arrList1.addAll(unCommon);

        return arrList1.stream().mapToInt(i -> i).toArray();
        }

}

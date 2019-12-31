package com.company;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        SolutionIntersectionOfTwoArrays sol= new SolutionIntersectionOfTwoArrays();
        int[] nums1 =new int[]{1,2,3,7,4,9,2};
        int[] nums2 =new int[]{1,2,3,4,5};

        System.out.print("[");
        for(int i:sol.intersection(nums1,nums2)){
            System.out.print(i+",");
        }
        System.out.println("]");
    }
}

class SolutionIntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> num1Hash = new HashSet<>();
        for(int i:nums1){
            num1Hash.add(i);
        }

        HashSet<Integer> common = new HashSet<>();

        for(int i:nums2){
            if(num1Hash.contains(i)){
                common.add(i);
            }
        }

        int[] result = new int[common.size()];
        int index=0;

        for(int i:common){
            result[index++]=i;
        }

        return result;
    }
}
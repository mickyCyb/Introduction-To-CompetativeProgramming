package com.company;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

       int[] newarrs = GenerateRandom();


            Ins_Sort(newarrs);
        printArray(newarrs);



    }

    public static int[] Ins_Sort(int[] A){

        int len_A = A.length;

        for(int i=1; i<len_A; i++){
            int curr = A[i];
            int j =i-1;

            while (j>=0 && A[j] > curr){
                A[j+1] =A[j];
                j--;
            }
            A[j+1] =curr;

        }


        return A;
    }

    public static void printArray(int arr[]){

        int len_arr = arr.length;
        System.out.print("[");
        for (int i = 0; i < len_arr; ++i) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }

    public static int[] GenerateRandom(){

        int maxNumber=101;

        Random random = new Random();
        int[] initialist = new int[maxNumber];



        for(int i=0; i<maxNumber; i++){
            initialist[i] = i;
        }

        for(int i=0;i<maxNumber;i++) {
            int randomIndexToSwap = random.nextInt(initialist.length);
            int temp = initialist[randomIndexToSwap];
            initialist[randomIndexToSwap] = initialist[i];
            initialist[i] = temp;
        }

        return initialist;
    }

}

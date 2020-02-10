package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {

        int[] arr = new int[]{12,40,3,55};
        radSort(arr,arr.length);
        //print(arr);
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(",");
            }

        }
        System.out.print("]");
    }

    public static int getMax(int arr[],int len){

        int max= arr[0];

        for(int i=1;i<len;i++){
            if(arr[i] > arr[i-1]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void countSort(int arr[],int len,int exp){

        int result[] = new int[len];
        int count[] = new int[10];
        Arrays.fill(count,0);

        for (int i = 0; i < len; i++) {
            count[(arr[i]/exp)%10] ++;
        }

        for (int i = 1; i <10 ; i++) {
            count[i] += count[i-1];
        }

        for (int i = arr.length -1; i>=0; i--) {
            result[count[(arr[i]/exp)%10] - 1] = arr[i];
            count[(arr[i]/exp)%10] --;
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = result[i];
        }
    }

    public static void radSort(int arr[],int len){
        int m = getMax(arr,len);

        for(int exp =1; m/exp > 0; exp*=10){
            countSort(arr,arr.length,exp);
        }
    }

    public static void print(int arr[]){

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+",");
        }
    }

}

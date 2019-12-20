package com.company;

import java.util.Random;

import static java.util.Arrays.sort;

public class QuickSort {
    public static void main(String[] args) {
        int newarr[] = new int[]{5,2,4,1,56,555};
        int nm=newarr.length;
        mainQuickSort(newarr,0,nm-1);
        printArray(newarr);

    }

     static int Qui_Sort(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;


    }

    public static void mainQuickSort(int arr[], int low, int high){
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = Qui_Sort(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            mainQuickSort(arr, low, pi-1);
            mainQuickSort(arr, pi+1, high);
        }


    }

    public static void printArray(int arr[]){

        int len_arr = arr.length;
        System.out.print("[");
        for (int i = 0; i < len_arr; ++i) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");
    }
}

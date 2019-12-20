package com.company;

import java.util.Random;

import static java.util.Arrays.sort;

public class MergeSort {
    public static void main(String[] args) {

        int newarr[] = new int[]{5,2,4,1,56};
        mainMerge(newarr,0,newarr.length-1);
        printArray(newarr);

    }

    public static int[] Mer_Sort(int[] A, int l, int m, int r){

        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = A[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = A[m + 1+ j];

        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                A[k] = L[i];
                i++;
            }
            else
            {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            A[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            A[k] = R[j];
            j++;
            k++;
        }

        return A;
    }

    public static void mainMerge(int arr[], int l, int r){
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;

            // Sort first and second halves
            mainMerge(arr, l, m);
            mainMerge(arr , m+1, r);

            // Merge the sorted halves
            Mer_Sort(arr, l, m, r);
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

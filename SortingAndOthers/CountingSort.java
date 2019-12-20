package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class CountingSort {
    public static void main(String[] args) {

        //int[] unsorted = new int[]{3,13,6,8,2,14,8,10};
        ArrayList<Integer>unsorted = new ArrayList<>();

       Collections.addAll(unsorted,13,6,8,2,14,8,10);
        int x = Collections.max(unsorted);

        ArrayList<Integer> array2 = new ArrayList<>();
        int [] finalArray = new int[unsorted.size()];

        for(int i=0; i<=x;i++){
           int c =0 ;
           for(int j=0; j<unsorted.size(); j++){
               if(i == unsorted.get(j)){
                   c++;
               }
           }
           array2.add(c);

       }
        int counter = 0;

        for(int k=0;k<=x; k++){
            if(array2.get(k)==0){
                continue;
            }
            else if(array2.get(k)!=0){
                int a =array2.get(k);

                while (a != 0){
                    finalArray[counter] = k;
                    a--;
                    counter++;
                }


            }
           // System.out.print(array2.get(k));
        }
        int y = finalArray.length;
        for(int n=0;n<y;n++){
            System.out.print(finalArray[n]);
            System.out.print(",");
        }

    }
}

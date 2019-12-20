package com.company;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        int [] finalList = GenerateRandomNumber();

        for(int i=0; i<finalList.length; i++){
            System.out.println(finalList[i]);
        }

    }


    public static int[] Sel_Sort(){


    return Sel_Sort();

    }



    public static int[] GenerateRandomNumber(){

        Random random = new Random();
        return random.ints(0,10).distinct().toArray();
    }
}
package com.company;

import java.util.Scanner;

public class TemporarilyUnAvailable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testcases = scanner.nextInt();
        scanner.nextLine();

        String[] stringInputs = new String[testcases];

        for (int i = 0; i < testcases; i++) {
            stringInputs[i] = scanner.nextLine();
        }

        //
        for (int i = 0; i < stringInputs.length; i++) {
            System.out.println( isAvailable(stringInputs[i]));
        }

        scanner.close();
    }

    public static int isAvailable(String inputStrings){

        int x =0;
        int y =0;


        String[] array = inputStrings.split(" ");
        int[] arr = new int[array.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        int r = arr[3];

        if (a> b){
            int temp = a;
            a = b;
            b=temp;
        }

        x = c - r;
        y = c + r;

        int total=0;

        if(x <= a && y >= b){
            return 0;
        }

        if(x >a && x < b){
            total = total +(x-a);
        }

        if(y<b && y>a){
            total = total +(b-y);
        }

        if(total !=0){
            return  total;
        }
        else{
            return b-a;
        }
    }



}

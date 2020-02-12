//package com.company;

import java.util.Scanner;

public class ErasingZeroes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // decide on the number of testcase.
        int testcases = scanner.nextInt();
        scanner.nextLine();

        String[] array = new String[testcases];

        for (int i = 0; i < testcases; i++) {
            array[i] = scanner.nextLine();
        }

        //
        for (int i = 0; i < array.length; i++) {
           int ans = zeroes(array[i]);
            System.out.println(ans);
        }
        scanner.close();
    }

    public static int zeroes(String str){

        int sum=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) =='1'){
                sum+=1;
            }
        }

//        String[] array = str.split(" ");
//        int[] arr = new int[array.length];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(array[i]);
//
//        }


        int removed=0;
        int temp=0;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i] == 1){
//                sum++;
//            }
//        }
       // System.out.println("sum is" + sum);

        int firt =0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='1' && temp==0){
                temp=1;
                firt=i;
            }
            else if(temp>0 && temp<sum){
                if(str.charAt(i)=='0'){
                    removed++;
                }
                else{
                    temp++;
                }
            }
        }


        return removed;
    }
}

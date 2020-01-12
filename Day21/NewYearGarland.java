package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class NewYearGarland {
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
            System.out.println(isGarland(array[i]));
        }
        scanner.close();
    }

    public static String isGarland(String inputString){

        String[] array = inputString.split(" ");
        int[] arr = new int[array.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(arr);

        // sort the arrays in descending order
        int a = arr[0];
        int b = arr[1];
        int c = arr[2]; // c is always the biggest number

        // the least two numbers must be less than only by one.
        if(a+b<(c-1)){
            return "No";
        }

        return "Yes";
    }
}

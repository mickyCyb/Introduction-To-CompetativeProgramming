package com.company;

import java.util.Scanner;

public class FindDivisible {
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
            finDivisible(array[i]);
        }
        scanner.close();
    }

    public static void finDivisible(String inputString){

        String[] array = inputString.split(" ");
        int[] arr = new int[array.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }

        // because a solution is guaranteed, at least the first number l and its double 2l satisfies the condition.
        System.out.println(arr[0] + " "+ 2*arr[0]);
    }
}

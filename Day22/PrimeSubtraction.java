package com.company;

import java.util.Scanner;

public class PrimeSubtraction {
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
            System.out.println(possibleprime(array[i]));
        }
        scanner.close();
    }

    public static String possibleprime(String inputString){

        String[] array = inputString.split(" ");
        long[] arr = new long[array.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Long.parseLong(array[i]);
        }

        long a = arr[0];
        long b = arr[1];

        if(a-b >= 2 ){
            return "YES";
        }

        return "NO";
    }


}

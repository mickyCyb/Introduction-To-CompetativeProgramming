package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeFriends {
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
            getDistance(array[i]);
        }
        scanner.close();

    }

    // function that does the computing
    public static void getDistance(String line) {
        String[] array = line.split(" ");
        int[] arr = new int[array.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }

        // sort each three numbers ascending.
        Arrays.sort(arr);

        int res;
        if (arr[0] == arr[1] && arr[0] == arr[2]) { // if the three numbers are equal
            System.out.println(0);
        }

        // if the first two numbers are equal
        else if (arr[0] == arr[1] && arr[1] != arr[2]) {
            if (arr[2] - arr[1] > 1) {      // if the difference is more than 1

                arr[2] = arr[2] - 1;
                arr[0] = arr[0] + 1;
                arr[1] = arr[1] + 1;

                res = Math.abs((arr[0] - arr[1]) + (arr[1] - arr[2]) + (arr[0] - arr[2]));
                System.out.println(res);
            }
            else if (arr[2] - arr[1] == 1) {    // if the difference is just 1
                arr[2] = arr[2] - 1;
                res = Math.abs((arr[0] - arr[1]) + (arr[1] - arr[2]) + (arr[0] - arr[2]));
                System.out.println(res);
            }
        }

        // if the last 2 elements are equal
        else if (arr[0] != arr[1] && arr[1] == arr[2]) {
            if (arr[1] - arr[0] > 1) {

                arr[0] = arr[0] + 1;
                arr[1] = arr[1] - 1;
                arr[2] = arr[2] - 1;

                res = Math.abs((arr[0] - arr[1]) + (arr[1] - arr[2]) + (arr[0] - arr[2]));
                System.out.println(res);
            }
            else if (arr[1] - arr[0] == 1) {
                arr[0] = arr[0] + 1;
                res = Math.abs((arr[0] - arr[1]) + (arr[1] - arr[2]) + (arr[0] - arr[2]));
                System.out.println(res);
            }

        }

        //if all three numbers are different
        else {
            arr[0] = arr[0] + 1;
            arr[2] = arr[2] - 1;
            res = Math.abs((arr[0] - arr[1]) + (arr[1] - arr[2]) + (arr[0] - arr[2]));
            System.out.println(res);
        }

    }
}

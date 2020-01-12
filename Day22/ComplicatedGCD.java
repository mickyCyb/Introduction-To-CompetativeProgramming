package com.company;

import java.util.Scanner;

public class ComplicatedGCD {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();

        System.out.println(findGcd(s1));

        scanner.close();
    }

    public static String findGcd(String inputString){
        String[] arr = inputString.split(" ");

        // if the given numbers are the same they have the same GCD, which is the number itself.
        if(arr[0].equals(arr[1])){
            return arr[0];
        }

        // for consecutive numbers, the GCD is always 1.
        return "1";
    }
}

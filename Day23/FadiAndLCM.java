package com.company;

import java.util.Scanner;

public class FadiAndLCM {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        long input = scanner.nextLong();

        System.out.println(findPair(input));

        scanner.close();
    }

    public static String findPair(long inputNumber){

        int sqrt = (int) Math.sqrt(inputNumber);
        for (int i = sqrt; i > 0; i--) {
            if (inputNumber % i == 0) {
                if (findGcd(inputNumber / i, i) == 1) {
                    return i + " " + (inputNumber / i);
                }
            }
        }

        return "NO";
    }

    public static long findGcd(long num1, long num2){
        long gcd =1;
        for(int i = 1; i <= num1 && i <= num2; ++i)
        {
// Checks if i is factor of both integers.
            if(num1 % i==0 && num2 % i==0)
                gcd = i;
        }
        return gcd;

    }
}

//package com.company;

import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        long x ;
        long y;
        if(n % a == 0){
            x = n/a;
        }
        else{
            x =(n/a) + 1;
        }


        if(m % a == 0){
            y = m/a;
        }
        else{
            y =(m/a) + 1;
        }
        System.out.println(x*y);
        scanner.close();

    }
}

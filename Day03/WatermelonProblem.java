package com.company;

import java.util.Scanner;

public class WatermelonProblem {

    //watermelon problem
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 2 || input % 2!= 0){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        scanner.close();
    }
}

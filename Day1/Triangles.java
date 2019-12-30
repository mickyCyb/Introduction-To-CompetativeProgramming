package com.company;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

//        triangleNo1();
        triangleNo2();

    }

    public static void triangleNo1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");
        int a = scanner.nextInt();
        for(int i= 1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void triangleNo2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");
        int a = scanner.nextInt();

        for(int i=0;i<a;i++){
            for(int j=0;j<a-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

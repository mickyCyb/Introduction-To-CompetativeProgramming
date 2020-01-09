//package com.company;

import java.util.Scanner;

public class Fraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        isProper(line);

        scanner.close();
    }

    public static void isProper(String inputString){

        String[] arr = inputString.split(" ");
        int[] array = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }

        int num = array[0];
      //  int div = num/2;
        int x=0;
        int y=0;

        if(num%2 ==0 && (num/2)%2==0){
            x = (num/2) -1;
            y = num -x;
            
            System.out.println(x + " "+ y);
        }
        else if(num%2 ==0 && (num/2)%2!=0){
            x = (num/2) -2;
            y = num - x;
            System.out.println(x + " "+ y);
        }
        else{
            x = (num/2);
            y = num -x;
            System.out.println(x + " "+ y);

        }

    }


}

package com.company;

import java.util.Scanner;

public class SumWithNegatives {

    public static void main(String[]args){

        //System.out.println(SumMethod("2","4"));
        //System.out.println(SubMethod("2","-4"));

    }
    public static String SumMethod(String num1, String num2){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first number: ");
         num1 = scanner.next();

        System.out.println("Enter the Second number: ");
        num2 = scanner.next();

        int carry =0;
        String totalsum ="";
        int num1Length = num1.length()-1;
        int num2Length = num2.length()-1;
        int smallnum = num1Length < num2Length ? num1Length:num2Length;

        for(int i=0; i<=smallnum; i++){
            if(num1Length > -1 && num2Length >-1){
                int result = Character.getNumericValue(num1.charAt(num1Length)) +
                        Character.getNumericValue(num2.charAt(num2Length)) + carry;
                carry = 0;

                if(result >=10){
                    carry = 1;
                    result = result - 10;
                }
                totalsum = totalsum + result;
                num1Length --;
                num2Length --;
            }
            else{
                break;
            }
        }

        if(num1Length <= -1){
            for(int i = num2Length; i >= 0; i--){
                totalsum = totalsum + (Character.getNumericValue(num2.charAt(i)) + carry);
                carry = 0;
            }
        }
        else {
            for(int i = num1Length; i >= 0; i--){
                totalsum = totalsum + (Character.getNumericValue(num1.charAt(i)) + carry) ;
                carry = 0;
            }
        }


        if(carry == 1){
            totalsum = totalsum.concat("1");
        }

        StringBuilder summation = new StringBuilder();

        for(int i = totalsum.length() - 1; i >= 0; i--){
            summation.append(totalsum.charAt(i));
        }

        return summation.toString();

    }

    public static String SubMethod(String num1, String num2){
        // calling the Scanner class
        Scanner scanner = new Scanner(System.in);
        //take input from the users
        System.out.println("Enter first number: ");
         num1 = scanner.next();

        System.out.println("Enter the Second number: ");
         num2 = scanner.next();

        // decide the sign type the two numbers have in front
        int num1char1sign;
        if(num1.charAt(0) == '-'){
            num1char1sign = -1;
        }else{
            num1char1sign = 1;
        }

        int num2char1sign;
        if(num2.charAt(0) == '-'){
            num2char1sign = -1;
        }else{
            num2char1sign = 1;
        }

        // calculate the length of the two numbers. because of the signs on the numbers subtracting 2 from the negative number is required.
        int num1Length = num1char1sign == 1 ? num1.length() - 1 : num1.length() - 2;
        int num2Length = num2char1sign == 1 ? num2.length() - 1 : num2.length() - 2;


        // find the smallest number
        int mindigit = num1Length < num2Length ? num1Length: num2Length;


        if(num1char1sign == -1)
            num1Length++;
        if(num2char1sign == -1)
            num2Length++;

        if(num1Length >-1 && num2Length> -1){
            if(num1char1sign == -1 && num2char1sign == -1 || num1char1sign ==1 && num2char1sign == 1){
                if(num1char1sign == -1)
                    return "-" + SumMethod(num1.substring(1), num2.substring(1));
                return SumMethod(num1, num2);
            }
            else if(num1char1sign == -1 && num2char1sign ==1){
                String subStr = num1.substring(1);
                if(Integer.parseInt(subStr) > Integer.parseInt(num2)){
                    return "-" + NegativeSum(subStr, num2, mindigit, num1Length - 1, num2Length);
                }
                else{
                    return NegativeSum(num2, subStr, mindigit, num2Length, num1Length - 1);
                }

            }
            else if(num1char1sign == 1 && num2char1sign == -1){
                String subStr = num2.substring(1);
                if(Integer.parseInt(subStr) > Integer.parseInt(num1)){
                    return "-" + NegativeSum(subStr, num1, mindigit, num1Length - 1 , num2Length);
                }
                else{
                    return NegativeSum(num1, subStr, mindigit, num1Length, num2Length - 1);
                }
            }


        }


        return "";

    }

    public static String NegativeSum(String num1, String num2, int mindigit, int num1Length, int num2Length){
        int resSum;
        int lend =0;
        String totalSum ="";

        for(int i = 0; i <= mindigit; i++){
            resSum = Character.getNumericValue(num1.charAt(num1Length)) - Character.getNumericValue(num2.charAt(num2Length)) - lend;
            if(resSum < 0){
                resSum = Character.getNumericValue(num1.charAt(num1Length)) - Character.getNumericValue(num2.charAt(num2Length)) + 10 - lend;
                lend = 1;
            }
            else
                lend = 0;

            num1Length--;
            num2Length--;

            totalSum += resSum;
        }

        if(num1Length <= -1){
            for(int i = num2Length; i >= 0; i--){
                totalSum = totalSum + (Character.getNumericValue(num2.charAt(i)) - lend);
            }
        }
        else {
            for(int i = num1Length; i >= 0; i--){
                totalSum = totalSum + (Character.getNumericValue(num2.charAt(i)) - lend);
            }
        }

        StringBuilder finalSum = new StringBuilder();

        for(int i = totalSum.length() - 1; i >= 0; i--){
            finalSum.append(totalSum.charAt(i));
        }

        return finalSum.toString();
    }


    }








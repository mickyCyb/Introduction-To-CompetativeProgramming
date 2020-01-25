package com.company;

import java.util.ArrayList;

public class Multiplication {
    public static void main(String[]args){

        System.out.println(Multiply("111","111"));

    }

    /*public static String getProductOf(){

    }*/

    private static String Multiply(String one, String two){
        int mulForOne = one.charAt(0) == '-' ? -1:1;
        int mulForTwo = two.charAt(0) == '-' ? -1:1;

        int lengthOfOne = mulForOne == 1 ? one.length() - 1 : one.length() - 2;//1
        int lengthOfTwo = mulForTwo == 1 ? two.length() - 1 : two.length() - 2;//1

        boolean isOneTheMin = lengthOfOne < lengthOfTwo;//f

        if(isOneTheMin) {
            if (mulForOne == -1 && mulForTwo == -1 || mulForOne == 1 && mulForTwo == 1)
                return mul(two, one, lengthOfTwo, lengthOfOne);
            else
                return "-" + mul(two, one, lengthOfTwo, lengthOfOne);
        }
        else {
            if (mulForOne == -1 && mulForTwo == -1 || mulForOne == 1 && mulForTwo == 1)
                return mul(one, two, lengthOfOne, lengthOfTwo);
            else
                return "-" + mul(one, two, lengthOfOne, lengthOfTwo);
        }
    }


    public static String mul(String num1,String num2, int num1len, int num2len){

        int mul;
        int carry =0;
        int count =0;
        ArrayList<String> listOfMulInOneLine = new ArrayList<>();
        ArrayList<Integer> indexOfMulInOneLine = new ArrayList<>();

        String mulOfOneNum;

        for (int i = num1len; i >= 0; i--){
            count++;
            mulOfOneNum = "";
            for (int j = num1len; j >= 0; j--){
                mul = Character.getNumericValue(num2.charAt(i)) * Character.getNumericValue(num1.charAt(j)) + carry;
                carry = 0;
                if(mul >= 10){
                    carry = mul / 10;
                    mul %= 10;
                }
                mulOfOneNum = mulOfOneNum.concat(Integer.toString(mul));
                if(indexOfMulInOneLine.size() < count) {
                    indexOfMulInOneLine.add(0);
                }
                else {
                    int index1 = indexOfMulInOneLine.get(count - 1);
                    indexOfMulInOneLine.remove(count - 1);
                    indexOfMulInOneLine.add(count - 1, index1 + 1);
                }
            }

            if(carry > 0)
                mulOfOneNum = mulOfOneNum.concat(Integer.toString(carry));

            listOfMulInOneLine.add(reverse(mulOfOneNum));
        }

        String Sum = "";
        int count2 = 0;
        carry = 0;
        for (int i = 0; i <= num1len + num2len - 1; i++){
            int sum = 0;
            for (int j = 0; j <= i; j++){
                if(j <= num2len && indexOfMulInOneLine.get(j) >= 0){
                    sum += Character.getNumericValue(listOfMulInOneLine.get(j).charAt(indexOfMulInOneLine.get(j)));
                    int index = indexOfMulInOneLine.get(j);
                    indexOfMulInOneLine.remove(j);
                    indexOfMulInOneLine.add(j, index - 1);
                }
            }
            sum += carry;
            carry = 0;
            if(sum >= 10){
                carry = sum / 10;
                sum = sum % 10;
            }
            Sum = Sum.concat(Integer.toString(sum));
        }

        count = Character.getNumericValue(listOfMulInOneLine.get(listOfMulInOneLine.size() - 1).charAt(0)) + carry;
        Sum = Sum.concat(Integer.toString(count));
        return reverse(Sum);
    }


    private static String reverse(String num){
        StringBuilder finalNumber = new StringBuilder();

        for(int i = num.length() - 1; i >= 0; i--){
            finalNumber.append(num.charAt(i));
        }

        return finalNumber.toString();
    }


}


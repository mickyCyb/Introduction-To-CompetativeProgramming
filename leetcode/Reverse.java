package com.company;

public class Reverse {
    public static void main(String[] args) {

        //SolutionReverse solrev = new SolutionReverse();
        //System.out.println(solrev.reverse(-345600));
        //StringNumReverse();
    }

    public static void StringNumReverse(){
        String num = "-7544000000";
        String rev ="";
        int numLength = num.length()-1;
        boolean isSubSign = num.charAt(0) == '-';

        if(num.charAt(0) == '-'){
            num=  num.substring(1,numLength+1);

        }
        System.out.println(num);
        System.out.println(numLength);



        for(int i=numLength-1; i>=0; i--){
            if(num.charAt(i) =='0'){
                continue;
            }else{
                rev = rev +num.charAt(i);

            }

        }
        if(isSubSign){
            rev = '-' + rev;
            System.out.println(rev);

        }else {

            System.out.println(rev);
        }

    }

}

// Solution for leetcode reverse problem

class SolutionReverse {
    public int reverse(int x) {

        int rev=0;
        //int count=0;
        while (x != 0){

            int rem = x%10;
            x /=10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) { // 7 is the result of Integer.MAX%10(the max integer value)
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)){ // -8 is the result of Integer.MAX%10 (the max integer value)
                return 0;
            }
            rev = (rev * 10) + rem;

            //count++;    -- return count to get the number of integers given.

        }
        return rev;


        }

    }

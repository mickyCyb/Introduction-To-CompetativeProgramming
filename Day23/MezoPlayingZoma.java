package com.company;

import java.util.Scanner;

public class MezoPlayingZoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        getMaxMoves(t, line);

        scanner.close();
    }

    public static void getMaxMoves(int t,String inputString){

        // a quick and most efficient answer would be to add 1 to t and return the answer.
        System.out.println(t+1);

        /*int lCount =0;
        int rCount =0;
        for(int i=0; i<t; i++){
            if(inputString.charAt(i)=='L'){
                lCount++;
            }
            else{
                rCount++;
            }
        }

        if(rCount!=0 && lCount==0){
            System.out.println(rCount +1);
        }
        else if(lCount!=0 && rCount==0){
            System.out.println(lCount +1);
        }
        else{
            System.out.println(rCount+lCount+1);
        }

*/    }


}

package com.company;

import java.util.Scanner;

public class SnowWalkingRobot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter testcases");
        int testcases = scanner.nextInt();

       // System.out.println("Enter the Strings ");
        scanner.nextLine();

        String[] inpString = new String[testcases];


        for (int i = 0; i < testcases; i++) {
            String newInput = scanner.nextLine();
            inpString[i] = newInput;
        }

        for (int i = 0; i < inpString.length; i++) {
            String val = getCorrectMove(inpString[i]);
            System.out.println(val.length());
            System.out.println(val);
        }

        scanner.close();

      //  String inputString = "LLL";
    }
    public static String getCorrectMove(String inputString){

        StringBuilder strBuilder = new StringBuilder(inputString);

        // move counter for each of the 4 moves
        int U_counter = 0;
        int D_counter = 0;
        int R_counter = 0;
        int L_counter = 0;

        // increase the counter based on the given moves
        for(int i=0; i<inputString.length(); i++){
            if(inputString.charAt(i) == 'U'){
                U_counter++;
            }
            else if(inputString.charAt(i) == 'D'){
                D_counter++;
            }
            else if(inputString.charAt(i) == 'R'){
                R_counter++;
            }
            else if(inputString.charAt(i) == 'L'){
                L_counter++;
            }
        }
        //check up and down equalize with the small moves that exits based on the pair
        // U & D , R & L

        if(U_counter > D_counter){
            U_counter = D_counter;
        }else{
            D_counter = U_counter;
        }


        // check right and left
        if(R_counter > L_counter){
            R_counter = L_counter;
        }else{
            L_counter = R_counter;
        }


        if(U_counter ==0 && R_counter!=0){
            R_counter  =1;
        }
        if(L_counter == 0 && U_counter!=0){
            U_counter =1;
        }

        int counter=0;
        for (int i = 0; i <U_counter ; i++) {
            strBuilder.setCharAt(counter, 'U');
            counter++;
        }
        for (int i = 0; i <R_counter ; i++) {
            strBuilder.setCharAt(counter, 'R');
            counter++;
        }
        for (int i = 0; i <U_counter ; i++) {
            strBuilder.setCharAt(counter, 'D');
            counter++;
        }
        for (int i = 0; i <R_counter ; i++) {
            strBuilder.setCharAt(counter, 'L');
            counter++;
        }

       // System.out.println(counter);
        return (strBuilder.substring(0, counter));

    }
}

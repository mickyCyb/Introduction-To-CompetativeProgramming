package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ShuffleHashing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter testcases");
        int testcases = scanner.nextInt();

        // System.out.println("Enter the Strings ");
        scanner.nextLine();

        String[] pass = new String[testcases];
        String[] hash = new String[testcases];


        for (int i = 0; i < testcases; i++) {

            pass[i] = scanner.nextLine();
            hash[i] = scanner.nextLine();

        }

        for (int i = 0; i < pass.length; i++) {
            String ans = shuffleHash(pass[i],hash[i]);
            System.out.println(ans);
        }

        scanner.close();

    }


    // function that checks if the given two Strings are anagram
    public static boolean isAnagram(String s, String t) {

        // sort the two strings (a-z order)
        String sorted1 = sortString(s);
        String sorted2 = sortString(t);

        // get the length of the strings
        int len1 = s.length();
        int len2 = t.length();

        //check if the two strings are equal in length
        boolean areEqualLength = (len1==len2);

        if(areEqualLength && sorted1.equals(sorted2)){
            return true;
        }else{
            return false;
        }
    }

    // this functions is used to sort the strings alphabetically
    public static String sortString(String initialString){

        char tempArray []= initialString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static String shuffleHash(String pass, String hash){

        int frontIndex =0;
        int lastIndex = pass.length();

        // if the hash and password doesnt have s1 and s2
        if(isAnagram(pass,hash)){
            return "YES";
        }

        for(int i=0; i<= hash.length(); i++){

            if(lastIndex > hash.length()){
                return "NO";
            }

            // sub string that checks if the has contain the password in its range
            String subStr = hash.substring(frontIndex, lastIndex);

            if(isAnagram(subStr, pass)){
                return "YES";
            }

                //else check the next range of words
                frontIndex ++;
                lastIndex ++;
        }

        return "No";
    }
}

package com.company;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        //SolutionAnagram solutionAnagram = new SolutionAnagram();
        //System.out.println(solutionAnagram.isAnagram("anagram","gramana"));  // returns true
        //System.out.println(solutionAnagram.isAnagram("anagram","gramanan")); // returns false

    }
}

class SolutionAnagram {
    public boolean isAnagram(String s, String t) {

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

}
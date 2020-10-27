import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] arr = s.toCharArray();
        int stringLength = s.length();
        long aCount =0; 
        for(char ch : arr){
            if(ch =='a'){
                aCount++;
            }
        }
        long mod = n % stringLength; 
        long res = n/stringLength;
        if(mod ==0){
            return aCount * (res);
        }
        long remainingLetter=0;
        for(int i=0; i < mod; i++){
            if(arr[i] == 'a'){
                remainingLetter++;
            }
        }
        return res * aCount + remainingLetter;
       
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

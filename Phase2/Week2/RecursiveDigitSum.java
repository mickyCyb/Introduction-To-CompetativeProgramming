import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RecursiveDigitSum{
    public static void main(String[] args) {
        
    }
}

class Solution {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {
        StringBuilder builder = new StringBuilder();
        String initialSum = Integer.toString(findSuperDigit(n));
        while(k>0){
            builder.append(findSuperDigit(initialSum));
            k--;
        }
        
        //System.out.println(builder.toString());
        return findSuperDigit(builder.toString());

    }
    static int findSuperDigit(String str){
        if(str.length() == 1){
            return Integer.parseInt(str);
        }
        int sum=0;
        for(int i=0; i< str.length();i++){
            int temp = Character.getNumericValue(str.charAt(i));
            sum+=temp;
        }
        return findSuperDigit(Integer.toString(sum));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

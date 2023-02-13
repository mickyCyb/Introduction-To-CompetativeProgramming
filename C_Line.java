import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class C_Line{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int testCases = sc.nextInt();
        for (int testCase = 0; testCase < testCases; testCase++) {
            int n = sc.nextInt();
            String s = sc.next();
 
            long total = 0;
            List<Long> turnAroundScores = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'L') {
                    turnAroundScores.add((long) ((n - i - 1) - i));
                    total += i;
                } else {
                    turnAroundScores.add((long) (i - (n - i - 1)));
                    total += n - i - 1;
                }
            }
 
            turnAroundScores.sort(Collections.reverseOrder());
            for (long turnAroundScore:
                    turnAroundScores) {
                if (turnAroundScore > 0) {
                    total += turnAroundScore;
                }
                System.out.print(total + " ");
            }
            System.out.println();
        }
    }
}

class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    public MyScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine(){
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

}

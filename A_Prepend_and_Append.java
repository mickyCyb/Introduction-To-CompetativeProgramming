import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Prepend_and_Append {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        int testCases = sc.nextInt();

        for(int i = 0; i < testCases; i++){
            int len = sc.nextInt();
            String inp = sc.nextLine();

            int ans = solve(len, inp);
            System.out.println(ans);
        }
    }

    static int solve(int len, String inp){
        int count = len;

        char[] ch = inp.toCharArray();

        int start = 0;
        int end = len-1;

        while(start <= end && ch[start] != ch[end]){
            start++;
            end --;
            count -=2;
        }
        return count;
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class C_Restoring_the_Duration_of_Tasks{
    public static void main(String[] args) {

        MyScanner sc  = new MyScanner();

        int testCase = sc.nextInt();

        while(testCase-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n], b = new int[n], arr = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }
            int time = a[0];
            for(int i = 0; i < n; i++){
                arr[i] = b[i] - Math.max(time, a[i]);
                time = b[i];
            }
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
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
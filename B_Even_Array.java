import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_Even_Array{
    public static void main(String[] args) {

        MyScanner sc = new MyScanner();
        int testcase = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        
        while(testcase-- > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int odd = 0, even = 0;
            for(int i = 0; i < n; i++){
                if(i % 2 != arr[i] % 2){
                    if(arr[i] % 2 == 1){
                        odd++;
                    }
                    else even++;
                }
            }
            if(odd==even)
                System.out.println(odd);
            else
                System.out.println(-1);
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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class D_Arpa_s_hard_exam_and_Mehrdad_s_naive_cheat{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println(1);
		}
		else if(n % 4 == 0) {
			System.out.println(6);
		}
		else if(n % 4 == 1) {
			System.out.println(8);
		}
		else if(n % 4 == 2) {
			System.out.println(4);
		}
		else {
			System.out.println(2);
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
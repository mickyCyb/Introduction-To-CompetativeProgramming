import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Brain_s_Photos{
    public static void main(String[] args) {
	    MyScanner sc = new MyScanner();
 
	    int row = sc.nextInt();
	    int col =  sc.nextInt();
 
	    char[][] input =  new char[row][col];
 
	    int color = 0,bw = 0;
 
	    for(int i = 0;i < row; i++){
	        for(int j = 0; j < col; j++){
	            input[i][j] = sc.next().charAt(0);
 
	            if(input[i][j] == 'W' || input[i][j] == 'B' || input[i][j] == 'G'){
	                bw++;
                }
	            else{
	                color++;
                }
            }
        }
	    if(color == 0){
	        System.out.println("#Black&White");
        }
	    else{
            System.out.println("#Color");
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
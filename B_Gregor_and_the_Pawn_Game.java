import java.util.Scanner;

public class B_Gregor_and_the_Pawn_Game{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int testcases = sc.nextInt();

    for (int t = 0; t < testcases; t++) {
      sc.nextInt();
      String top = sc.next();
      String down = sc.next();
      System.out.println(solve(top, down));
    }

    sc.close();
  }

  static int solve(String top, String down) {
    int max = 0;
    char[] arr = down.toCharArray();
    for (int i = 0; i < top.length(); ++i){
      if (top.charAt(i) == '0'){
        if (arr[i] == '1'){
          arr[i] = '0';
          max++;
        }
      }else{
        if(i != 0 && arr[i - 1] == '1'){
          arr[i - 1] = '0';
          max++;
        }else if(i != top.length() - 1 && arr[i + 1] == '1'){
          arr[i + 1] = '0';
          max++;
        }
      }
    }

    return max;
    }
}
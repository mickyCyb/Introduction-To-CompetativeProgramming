import java.util.Arrays;
import java.util.Scanner;

public class C_Interesting_drink{
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int a[] = new int[n];
       for(int i = 0; i < n; i++){
           a[i] = sc.nextInt();
       }
       Arrays.sort(a);
       int q = sc.nextInt();
       while(q-- > 0)
       {
           int k = sc.nextInt();
           System.out.println(solve(0,n,k,a));
       }
        
    }

    static int solve(int low, int high, int key, int arr[]){
        while(low < high){
            int mid = (low + high) / 2;
            if(arr[mid] <= key){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
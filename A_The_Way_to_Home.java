import java.util.HashSet;
import java.util.Scanner;

public class A_The_Way_to_Home{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        sc.close();
        
        HashSet<Integer> list = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                list.add(i);
            }
        }
    
        int pos = 0;
        int counter = 0;
        while (pos != n-1){
            counter += 1;
            boolean found = false;
            
            for(int i = pos + d; i > pos; i--){
                if(list.contains(i)){
                    pos = i;
                    found = true;
                    break;
                }
            }
            
            if(!found){
                System.out.println(-1);
                return;
            }
        }
        
        System.out.println(counter);
    }
}
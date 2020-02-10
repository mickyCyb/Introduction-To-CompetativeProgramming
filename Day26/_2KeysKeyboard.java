/**
 * _2KeysKeyboard
 */
public class _2KeysKeyboard {

    public static void main(String[] args) {
        
        Solution_2KeysKeyboard solution_2KeysKeyboard = new Solution_2KeysKeyboard();
        int ans = solution_2KeysKeyboard.minSteps(6);
        System.out.println(ans);
    }
}

class Solution_2KeysKeyboard {
    public int minSteps(int n) {
        
        int steps =0;
        int numberOfCharToCopy =0;
        int charCopies=1;

        while(n!=charCopies){
            if(n%charCopies==0){
                numberOfCharToCopy = charCopies;
                steps++;
            }
           
            charCopies +=numberOfCharToCopy;
            steps++;
        }



        return steps;
    }
}
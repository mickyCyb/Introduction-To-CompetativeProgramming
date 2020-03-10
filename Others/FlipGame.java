/**
 * FlipGame
 */
import java.util.*;
public class FlipGame {

    public static void main(String[] args) {
        SolutionFlipGame flip = new SolutionFlipGame();
        List<String> ans = new ArrayList<>();
        ans = flip.generatePossibleNextMoves("++++");
        for (int i = 0; i < ans.size(); i++) {
         System.out.println(ans.get(i));
        }
    }
}

class SolutionFlipGame{

    public List<String> generatePossibleNextMoves(String s) {

        List<String> allMoves = new ArrayList<>();
        char[] signCharacter = s.toCharArray();
        for(int i=0;i<signCharacter.length - 1;i++){

            //if the consecutive characters are the same '+'', flip them to '-' and add them the the list as a string
            if(signCharacter[i] == signCharacter[i+1] && signCharacter[i] =='+'){
                signCharacter[i] = signCharacter[i+1] = '-';
                allMoves.add(new String(signCharacter));
                // after adding them to the list flip them back to '+' to explore other unique moves
                signCharacter[i] = signCharacter[i+1] = '+';
            }
        }
        
        return allMoves;
    }


}
/**
 * DivisorGame
 */
public class DivisorGame {

    public static void main(String[] args) {
        SolutionDivisorGame solutionDivisorGame = new SolutionDivisorGame();
        boolean ans = solutionDivisorGame.divisorGame(4);// true
        System.err.println(ans);
    }
}

class SolutionDivisorGame {
    public boolean divisorGame(int N) {
        

        // if the number is even the condition is always satisfied
        return N%2 ==0;
    }
}
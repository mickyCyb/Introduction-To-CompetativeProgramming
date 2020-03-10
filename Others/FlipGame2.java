/**
 * FlipGame2
 */
public class FlipGame2 {

    public static void main(String[] args) {
        SolutionFlipGame2 flip = new SolutionFlipGame2();
        boolean ans = flip.canWin("+++++");
        System.out.println(ans);
    }
}

class SolutionFlipGame2{

    public boolean canWin(String s){

        if(s == null  || s.length()<2){
            return false;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) =='+' && s.charAt(i+1) =='+'){
                String nextState = s.substring(0,i) + "--" + s.substring(i+2);

                if(!canWin(nextState)){
                    return true;
                }
            }
        }

        return false;
    }

}
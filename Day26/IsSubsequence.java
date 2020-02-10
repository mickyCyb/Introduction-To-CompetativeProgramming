/**
 * IsSubsequence
 */
public class IsSubsequence {

    public static void main(String[] args) {
        SolutionIsSubsequence solutionIsSubsequence = new SolutionIsSubsequence();
        boolean ans = solutionIsSubsequence.isSubsequence("ace", "abcde");
        System.out.println(ans);
    }
}


class SolutionIsSubsequence {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0){
            return true;
        }
        int indexOfS =0;
        for(int i=0;i<t.length();i++){

            if(t.charAt(i) == s.charAt(indexOfS)){
                indexOfS++;
            }
            if(indexOfS == s.length()){
                return true;
            }
        }

        return false;
    }
}
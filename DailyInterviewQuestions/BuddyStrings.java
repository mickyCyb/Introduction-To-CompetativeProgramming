import java.util.HashSet;
public class BuddyStrings{
    public static void main(String[] args) {
        SolutionBuddyStrings buddies = new SolutionBuddyStrings();
        System.out.println(buddies.buddyStrings("ab","ba"));
    }
}


class SolutionBuddyStrings {
    public boolean buddyStrings(String A, String B) {
        
        
        if(A.length() != B.length() || A.length()  < 2){
            return false;
        }
        
        // sicne the maximum difference b/n the two strings should be 2, we use 2 variables
        // to hold those indexes. (initialized with 1 since indexing start from 0)
        int differentIndex1 = -1;
        int differentIndex2 = -1;
        
        for(int i=0; i<A.length();i++){
            if(A.charAt(i) != B.charAt(i)){
                if(differentIndex1 == -1){
                    differentIndex1 = i;
                }
                else if(differentIndex2 == -1){
                    differentIndex2 = i;
                }
                else{
                    return false;   // because the difference of characters exceeded 2
                }
            }
        }
        
        // a set to check if all elements in A are the same
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<A.length(); i++){
            set.add(A.charAt(i));
        }
        
        // differentIndex1 will have value of -1 if corresponding characters are the same
        // we need to handle cases like 'aa' and 'abcda'
        if(differentIndex1 == -1){
            if(set.size() <A.length()){ // b/c there is atleast 1 double element,set size is                                               always less than
                return true;
            }
            else{
                return false;
            }
        }
        
        // this implies, the corresponding indexes are the same but all the characters are             // unique. example 'ab' and 'ab'
        if(differentIndex2 == -1){
            return false;
        }
        
        // check the two positions on each string when swaped gives the same character
        boolean isSwapPossible = A.charAt(differentIndex1) == B.charAt(differentIndex2) &&
                                 A.charAt(differentIndex2) == B.charAt(differentIndex1);
        
        return isSwapPossible;
    }
}
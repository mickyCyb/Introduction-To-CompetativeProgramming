/**
 * ShiftingLetters
 */
public class ShiftingLetters {

    public static void main(String[] args) {
     //System.out.println( (char)('y' + 1));
       SolutionShiftingLetters shiftingLetterss = new SolutionShiftingLetters();
       String  ans  = shiftingLetterss.shiftingLetters("bad", new int[]{10,20,30});
       System.out.println(ans);

    }
}

class SolutionShiftingLetters {
    public String shiftingLetters(String S, int[] shifts) {
     
        int sum=0;
        String result ="";      

        for(int i = shifts.length - 1; i >= 0; i--){
            shifts[i] %= 26;
            sum += shifts[i];
            shifts[i] = sum;
        }
       

        for(int i=0; i<S.length();i++){
            int curr = shifts[i];
            int ss= (S.charAt(i)  - 97 + curr) %26;

            //System.out.println(curr);
            char c =(char)(ss+97);
            result +=c; 
            //System.out.println("here "+result);
        }  

        return result;
    }
}
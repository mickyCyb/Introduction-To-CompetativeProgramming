import java.util.*;
public class LetterCombinationsofAPhoneNumber {
    public static void main(String[] args) {
        SolutionLetterCombo combo = new SolutionLetterCombo();
        combo.letterCombinations("23");
    }
}

class SolutionLetterCombo {
    
    String [] dialMapping = {
        "0",
        "1",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        if(digits == null || digits.length() == 0){
            return output;
        }
        combinations(digits,output,0,"");
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
        return output;
    }

    public void combinations(String digits, List<String>output, int index, String singleCombo){
        if(index == digits.length()){
            output.add(singleCombo);
            return;
        }
        // this outputs 'a,b,c'
        String letter = dialMapping[digits.charAt(index) - '0'];
        //System.out.println(letter);
        for(char ch : letter.toCharArray()){
            combinations(digits, output, index + 1, singleCombo + ch);
        }
    }

}

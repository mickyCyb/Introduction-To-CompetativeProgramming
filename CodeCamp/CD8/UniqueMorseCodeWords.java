import java.util.HashSet;

/**
 * UniqueMorseCodeWords
 */
public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        
    }
}

class SolutionUniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        
        HashSet<String> stringSet = new HashSet<>();
        int tranformations =0;
        
        String oneWord="";

        String arr[] = new String[]{
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",

            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",

            "...","-","..-","...-",".--","-..-","-.--","--.."
        };

        for(int i=0; i<words.length;i++){
            oneWord = words[i];
            StringBuilder strBuild = new StringBuilder();
            for(int j=0;j<oneWord.length(); j++){
                strBuild.append(arr[oneWord.charAt(j) -97]);
            }
            stringSet.add(strBuild.toString());

        }
        tranformations = stringSet.size();

        return tranformations;
    }
}
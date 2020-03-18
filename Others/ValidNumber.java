/**
 * ValidNumber
 */
public class ValidNumber {

    public static void main(String[] args) {
        SolutionValidNumber solutionValidNumber = new SolutionValidNumber();
        System.out.println(solutionValidNumber.isNumber(".1"));
    }
}

class SolutionValidNumber {
    public boolean isNumber(String s) {
        
        s=s.trim();
        boolean numberFound = false;
        boolean eFound= false;
        boolean dotFound = false;
        
        for(int i=0;i<s.length();i++){
           char currentChar = s.charAt(i);
            if(Character.isDigit(currentChar)){
                numberFound = true;
            }
            else if(currentChar =='e'){
                if(!numberFound || eFound){
                    return false;
                }
                
                eFound = true;
                numberFound = false;
            }
            else if(currentChar =='.'){
                if(dotFound || eFound){
                    return false;
                }
                dotFound = true;
            }
            else if(currentChar=='-' || currentChar =='+'){
                if(i!=0 && s.charAt(i-1) !='e'){
                    return false;
                }
            }
            else{
                return false;
            }
            
        }
        return numberFound;
    }
}
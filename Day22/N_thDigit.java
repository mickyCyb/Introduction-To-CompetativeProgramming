/**
 * N_thDigit
 */
public class N_thDigit {

    public static void main(String[] args) {
        
        SolutionN_thDigit solutionN_thDigit = new SolutionN_thDigit();
        System.out.println(solutionN_thDigit.findNthDigit(13));
    }
}

class SolutionN_thDigit {
    public int findNthDigit(int n) {

        // start of each digit with different digit length
        int firstStartOfDigit = 1;
        // to keep track of digit length
        int lengthOfEachDigit = 1 ;
        // to keep track of number of the current digit.
        long numberOfDigits = 9;

        // check to which set of numbers n belong to. i.e (1..9), (10..99), (100..999)...
        while( n > lengthOfEachDigit * numberOfDigits){
            n -= lengthOfEachDigit * numberOfDigits;
            lengthOfEachDigit ++;
            firstStartOfDigit *= 10;
            numberOfDigits *= 10;
        }

        // get the number that contains the required number(character)
        firstStartOfDigit +=(n-1) / lengthOfEachDigit;
        String NthNumber = Integer.toString(firstStartOfDigit);
        
        // get the exact character from the calculated number. 
        return Character.getNumericValue(NthNumber.charAt((n-1)%lengthOfEachDigit));
    }
}
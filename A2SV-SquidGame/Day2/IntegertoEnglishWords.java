
public class IntegertoEnglishWords {
    
}
class Solution {
    String[] underTen = new String[] {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };
    String[] underTwenty = new String[] {
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };
    private final String[] underHundred = new String[] {
        "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    
    public String numberToWords(int num) {
        String ans = num == 0 ? "Zero" : convertToWord(num); 
        return ans;
    }
    
    private String convertToWord(int num) {
        String result = "";
        if(num < 10){
            result = underTen[num];
        }
        else if(num < 20){
            result = underTwenty[num - 10];
        }
        else if(num < 100){
            result = underHundred[num / 10] + " " + convertToWord(num % 10);
        }
        else if(num < 1000){
            result = convertToWord(num / 100) + " Hundred " +  convertToWord(num % 100);
        }
        else if(num < 1000000){
            result = convertToWord(num / 1000) + " Thousand " +  convertToWord(num % 1000);
        }
        else if (num < 1000000000){
            result = convertToWord(num / 1000000) + " Million " +  convertToWord(num % 1000000);
        } 
        else{
            result = convertToWord(num / 1000000000) + " Billion " + convertToWord(num % 1000000000);
        } 
        return result.trim();
    }
}
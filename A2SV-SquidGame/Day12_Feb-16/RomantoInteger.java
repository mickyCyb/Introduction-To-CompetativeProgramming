import java.util.HashMap;

public class RomantoInteger {
    
}
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int index = 0;
        int sum = 0;
        while(index < s.length()){
            if(index + 1 < s.length() && s.charAt(index) == 'I' && s.charAt(index + 1) == 'V'){
                sum += 4;
                index++;
            }
            else if(index + 1 < s.length() && s.charAt(index) == 'I' && s.charAt(index + 1) == 'X'){
                sum += 9;
                index++;
            }
            else if(index + 1 < s.length() && s.charAt(index) == 'X' && s.charAt(index + 1) == 'L'){
                sum += 40;
                index++;
            }
            else if(index + 1 < s.length() && s.charAt(index) == 'X' && s.charAt(index + 1) == 'C'){
                sum += 90;
                index++;
            }
            else if(index + 1 < s.length() && s.charAt(index) == 'C' && s.charAt(index + 1) == 'D'){
                sum += 400;
                index++;
            }
            else if(index + 1 < s.length() && s.charAt(index) == 'C' && s.charAt(index + 1) == 'M'){
                sum += 900;
                index++;
            }else{
                sum += map.get(s.charAt(index));
            }
            index++;
        }
        return sum;
    }
}
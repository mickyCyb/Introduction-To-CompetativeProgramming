import java.util.*;
import java.lang.*;
public class LargestTimeForGivenDigits{
    public static void main(String[] args) {
        SolutionLargestTimeforGivenDigits sol = new SolutionLargestTimeforGivenDigits();
        String ans = sol.largestTimeFromDigits(new int[] {1,2,3,4});
        System.out.println(ans);
    }
}

class SolutionLargestTimeforGivenDigits {
    public String largestTimeFromDigits(int[] A) {
        
        HashMap<Integer,Integer> map = new HashMap<>(); // use hashmap because repition is not allowed
        StringBuilder builder = new StringBuilder();
        
        // variables to hold the hours and minute as h1h2:m1m2
        int h1 = -1;
        int h2 = -1;
        int m1 = -1;
        int m2 = -1;
        int count=0;    // a varibale to check if there are numbers (> 2 in frequency) greater than 5, because
                        // they determine the max hours to be assigned e.g 2,0,6,6 -> 06:26.
                        // if the numbers are > 5 and their count is < 2, it violates the minutes rule.
        for(int num : A){
            if(num > 5){
                count++;
            }
            if(!map.containsKey(num)){
                map.put(num,1);
            }
            
            else{
               map.put(num, map.get(num) + 1); 
            }    
        }
        // h1
        //because the largest time is found if we have 2 the beginning and then 1, then 0, we start from 2
        if(map.containsKey(2) && count<2){
            h1 = 2;
            map.put(2, map.get(2) - 1);
        }
        else if(map.containsKey(1)){
            h1 = 1;
            map.put(1, map.get(1) - 1);
        }
        else if(map.containsKey(0)){
            h1 = 0;
            map.put(0, map.get(0) - 1);
        }
        else{
            return "";
        }
        builder.append(Integer.toString(h1));
        /////// h2
        // determine h2 by not violating h1 (time rule)
        if(h1 ==2){
            for(int i=3;i>=0;i--){  //start from 3 because the max value of the second hour digit is 3 (23:59)
                if(map.containsKey(i)){     // where h1 ==2
                    if(map.get(i)>0){
                        h2 =i;
                        map.put(i,map.get(i)-1);
                        break;  //no need to check the rest if we have the largest
                    }
                }
            }
        }
        else if(h1 == 0 || h1 == 1){    // if h1 starts with 0 or 1, then h2 have range to be from 0 t0 9
            for(int i=9;i>=0;i--){      // 06:44 or 19:34
                if(map.containsKey(i)){
                    if(map.get(i)>0){
                        h2 = i;
                        map.put(i,map.get(i)-1);
                        break;
                    }
                }
            }
        }
        if(h2 == -1){ // means there is no appropriate value for h2 so return ""
            return "";
        } else{
            builder.append(Integer.toString(h2));
        }

        builder.append(":");

        ///////m1
        for(int i=5;i>=0;i--){      //the first minute digit ranges from 0 to 5 (m1)
            if(map.containsKey(i)){
                if(map.get(i)>0){
                    m1 =i;
                    map.put(i,map.get(i)-1);
                    break;
                }
            }
        }
        if(m1 == -1){
             return "";
        }else{
            builder.append(Integer.toString(m1));
        }
        //// m2
        for(int i=9;i>=0;i--){      //the first minute digit ranges from 0 to 9 (m2)
            if(map.containsKey(i)){
                if(map.get(i)>0){
                    m2 =i;
                    map.put(i,map.get(i)-1);
                    break;
                }
            }
        }
        
        if(m2 == -1){
            return "";
        }else{
            builder.append(Integer.toString(m2));
        }
        
        return builder.toString();
    }
}



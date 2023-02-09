import java.util.HashMap;

public class ReformatDate {
    
}
class Solution {
    public String reformatDate(String date) {

        String[] d = date.split(" ");

        HashMap<String,String> map = new HashMap<>();

        map.put("Jan","01");
        map.put("Feb","02"); 
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06"); 
        map.put("Jul","07"); 
        map.put("Aug","08");
        map.put("Sep","09"); 
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");

        StringBuilder res = new StringBuilder();

        res.append(d[2]);
        res.append("-");
        res.append(map.get(d[1]));
        res.append("-");

        String day = d[0].length() == 4 ? d[0].substring(0,2) : "0" + d[0].substring(0,1);
        res.append(day);

        return res.toString();
    }
}
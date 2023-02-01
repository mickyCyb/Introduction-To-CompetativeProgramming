import java.util.*;
public class EarliestPossibleDayofFullBloom {
    
}

class timeComparator implements Comparator<ArrayList<Integer>> {
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        if(a.get(1) == b.get(1)) return 0;
        else if(a.get(1) < b.get(1)) return 1;
        return -1;
    }
}

class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        ArrayList<ArrayList<Integer>> times = new ArrayList<>();
        for(int i = 0; i < plantTime.length; i++) times.add(new ArrayList<>(Arrays.asList(plantTime[i],growTime[i])));
        Collections.sort(times, new timeComparator());
        int time = 0, currtime = 0;
        for(int i = 0; i < times.size(); i++) {
            time = Math.max(time, times.get(i).get(0)+times.get(i).get(1)+currtime);
            currtime += times.get(i).get(0);
        }
        return time;
    }
}

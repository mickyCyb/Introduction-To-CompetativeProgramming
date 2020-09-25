public class TaskSchedule{
	public static void main(String[] args) {
		
	}
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        int[] charArray = new int[26];
        int max = 0;
        int maxCount=0;
        
        // get the most frequent character's fequency 
        for (char c: tasks){
            charArray[c-'A']++;
            max = Math.max(charArray[c-'A'], max);
        }
        for (int i: charArray){
            if (i == max)
                maxCount++;
        }
        
        return Math.max(tasks.length, (max-1) * (n+1) + maxCount);
    }
}
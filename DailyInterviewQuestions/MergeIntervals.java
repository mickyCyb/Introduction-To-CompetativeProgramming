class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <=1){
            return intervals;
        }
        
        Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        
        List<int[]> result = new ArrayList<>();
        int [] currentInterval = intervals[0];
        result.add(currentInterval);
        
        for(int[] interval : intervals){
            int currentBegin = currentInterval[0];
            int currentLast = currentInterval[1];
            int nextBegin = interval[0];
            int nextLast = interval[1];
            
            if(currentLast >= nextBegin){
                currentInterval[1] = Math.max(currentLast,nextLast);
            }
            else{
                currentInterval = interval;
                result.add(currentInterval);
            }
                //System.out.println( Arrays.toString(currentInterval) );
                
        }
        return result.toArray(new int[result.size()][]);
    }
}
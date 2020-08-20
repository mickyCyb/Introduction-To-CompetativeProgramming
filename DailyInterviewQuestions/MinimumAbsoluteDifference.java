class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i] - arr[i-1] < minDifference){
                minDifference = arr[i] - arr[i-1];
            }
        }
        
        for(int j=1; j<arr.length; j++){
            List<Integer> pairs = new ArrayList<>();
            if(arr[j] - arr[j-1] == minDifference){
                pairs.add(arr[j-1]);
                pairs.add(arr[j]);
                result.add(pairs);
            }
            
        }
        return result;
    }
}
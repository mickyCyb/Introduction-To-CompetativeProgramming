class Solution {
    public int findLucky(int[] arr) {
        
        // 4ms solution using HashMap
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int luckyNumber = -1;
//         for(int n : arr){
//             if(!map.containsKey(n)){
//                 map.put(n,1);
//             }
//             else{
//                 map.put(n, map.get(n) +1);
//             }
//         }
        
//         for(int key : map.keySet()){
//             if(key == map.get(key) && key > luckyNumber){
//                 luckyNumber = key;
//             }
//         }
//         return luckyNumber;
        
        // solution using count array
        
        int [] countArr = new int[501];
        // add 1 to the element in the count array everytime the number appears in arr
        for(int n : arr){
            countArr[n]++;
        }
        
        // since we want the largest number as our lucky number, we should start from the end         of the count array
        for(int i=countArr.length-1; i>0; i--){
            if(i == countArr[i] ){
                return i;
            }
        }
        return -1;
    }
}
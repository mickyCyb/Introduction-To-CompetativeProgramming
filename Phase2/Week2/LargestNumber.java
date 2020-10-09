public class LargestNumber{
    public static void main(String[] args) {
        
    }
}

class Solution {
    public String largestNumber(int[] nums) {
       
        StringBuilder builder = new StringBuilder();
        // create a string array and the numbers there
        String[] arr = new String[nums.length]; 
        for(int i=0; i < nums.length; i++){
            arr[i] = Integer.toString(nums[i]);
        }
        // sort the string array by modifying the compare function in comparator(String sorting)
        // 
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String str1, String str2){
                String o1 = str1 + str2;
                String o2 = str2 + str1;
                return o2.compareTo(o1);
            }
            });
        
        //check the first element in the sorted arr,if the greatest number is 0, no need to check the rest
        if(arr[0].equals("0")) return "0";
        
        for(String st : arr){
            builder.append(st);
        }   
        
        return builder.toString();
    }
}
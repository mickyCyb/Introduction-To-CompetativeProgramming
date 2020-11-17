class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        
        if(nums1.length > nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int m = nums1.length;
        int n = nums2.length;
        
        int low = 0;
        int high = m;
        int half = (m + n + 1)/2;
        
        while(low <= high){
            int nums1Mid = (low + high)/2;
            int nums2Mid = half - nums1Mid; // to make sure the number of left partion of                   nums1 and nums2 and right partion of nums1 and nums 2 are equal
            
            if(nums1Mid < high && nums2[nums2Mid -1] > nums1[nums1Mid]){
                low = nums1Mid +1;
            }
            else if(nums1Mid > low  && nums1[nums1Mid - 1] > nums2[nums2Mid]){
                high = nums1Mid -1;
            }
            // if we reached here, we find the position on the two arrays where we can make
            // a median
            else{
                int maxLeft =0;
                if(nums1Mid ==0){   // left side of nums1 is empty
                    maxLeft = nums2[nums2Mid -1];
                }
                else if(nums2Mid ==0){ // left side of nums2 is empty
                    maxLeft = nums1[nums1Mid -1];
                }
                else{ // both arrays have left partitions
                    maxLeft = Math.max(nums1[nums1Mid -1],nums2[nums2Mid -1]);
                }
                // check if the total length is odd
                // if so just return the maxLeft
                if((m + n) % 2 ==1){
                    return maxLeft;
                }
                
                //if the total sum is even
                
                int minRight =0;
                if(nums1Mid == m){ // if right side of nums1 is empty
                    minRight = nums2[nums2Mid];
                }
                else if(nums2Mid == n){ // if right side of nums2 is empty
                    minRight = nums1[nums1Mid];
                }
                else{
                    minRight = Math.min(nums1[nums1Mid],nums2[nums2Mid]);
                }
                
                // if it is even return the average
                return (maxLeft + minRight)/2.0;
            }
        }
        return 0.0; // the return type is double
    }
}
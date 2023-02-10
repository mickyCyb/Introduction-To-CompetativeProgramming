public class MedianofTwoSortedArrays {
    
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1 == null && nums2 == null){
            return 0;
        }
        
        if(nums1 == null){
            return nums2[(nums2.length - 1) / 2] * 0.5 + nums2[nums2.length / 2] * 0.5;
        }
        
        if(nums2 == null){
            return nums1[(nums1.length - 1) / 2] * 0.5 + nums1[nums1.length / 2] * 0.5;
        }
        
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int n = nums1.length;
        int m = nums2.length;
        
        int left = 0;
        int right = n;
        
        while(left < right){
            int start = (right - left) / 2 + left;
            int end = (n + m) / 2 - start;
            
            if(nums1[start] < nums2[end - 1]){
                    left = start + 1;
            }else{
                right = start;
            }
        
        }
        int first = left;
        int second = (n + m) / 2 - left;

        int shorterLeft = first == 0 ? Integer.MIN_VALUE : nums1[first - 1];
        int shorterRight = first == n ? Integer.MAX_VALUE : nums1[first];

        int longerLeft = second == 0 ? Integer.MIN_VALUE : nums2[second - 1];
        int longerRight = second == m ? Integer.MAX_VALUE : nums2[second];

        if((n + m) % 2 == 1) {
            return Math.min(shorterRight, longerRight);
        }else{
            return Math.max(shorterLeft, longerLeft) * 0.5 + Math.min(shorterRight, longerRight) * 0.5;
        }

    }
}
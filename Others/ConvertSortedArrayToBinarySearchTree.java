import java.util.*;
public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        SolutionConvertSortedArrayToBinarySearchTree conv = new SolutionConvertSortedArrayToBinarySearchTree();
        TreeNode node = conv.sortedArrayToBST(new int[]{1,2,3,4,5,6});
        
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        return convert(nums, 0, nums.length-1);
    }
    // using binary serach we can start from the middle to build a correct binary search tree
    public TreeNode convert(int[] nums, int front, int last){
        if(front > last){
            return null;
        }
        int mid = front + (last-front)/2;
        // the mid element is going to be the root in every recursion
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convert(nums, front, mid -1);
        node.right = convert(nums,mid+1,last);
        
        return node;
    }
}
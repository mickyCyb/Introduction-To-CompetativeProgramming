/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum =0;
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        getSum(root);
        return sum;
    }
    public int getSum(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftSum = getSum(node.left);
        int rightSum = getSum(node.right);
        
        sum += Math.abs(rightSum - leftSum);
        
        return leftSum + rightSum + node.val;
    }
}
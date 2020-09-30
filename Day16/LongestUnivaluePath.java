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
    int count = 0;
    public int longestUnivaluePath(TreeNode root) {
        countPath(root);
        return count;
    }
    
    public int countPath(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = countPath(node.left);
        int right = countPath(node.right);
        
        int leftCount =0;
        int rightCount =0;
        if(node.left != null && node.val == node.left.val){
            leftCount +=1 + left;
        }
        if(node.right != null && node.val == node.right.val){
            rightCount +=1 + right;
        }
        count = Math.max(count, leftCount + rightCount);
        
        return Math.max(leftCount,rightCount);
    }
}
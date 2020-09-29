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
    int min = Integer.MAX_VALUE;
    TreeNode previousNode = null;
    public int getMinimumDifference(TreeNode root) {
       
        inorder(root);
        return min;
    }
    public void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        if(previousNode != null && Math.abs(previousNode.val - node.val) < min){
            min = Math.abs(previousNode.val - node.val);
        }
        previousNode = node;
        inorder(node.right);
    }
    
    
}
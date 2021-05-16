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
    
   // int sum = 0;
    public int sumNumbers(TreeNode root) {
        
        int []sum =new int[1];
        dfs(root, 0,sum);
        
        return sum[0];
    }
    
    public void dfs(TreeNode node,int number,int[] sum){
        
        if(node == null){
            return;
        }
        
        if(node.left == null && node.right == null){
            sum[0] += (number*10) + node.val;
            return;
        }
        
        dfs(node.left, (number)*10 + node.val,sum);
        dfs(node.right,(number)*10 + node.val,sum);


    }
}
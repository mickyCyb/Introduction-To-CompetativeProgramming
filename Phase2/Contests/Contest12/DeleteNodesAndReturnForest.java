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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        List<TreeNode> result = new ArrayList<>();
        for(int n : to_delete){
            set.add(n);
        }
        
        TreeNode res = dfs(root,set,result);
        if(res != null){ // or !set.contains(root.val)
            result.add(res);
        }
        return result;
    }
    
    public TreeNode dfs(TreeNode node, HashSet<Integer> set,List<TreeNode> result){
        if(node == null){
            return null;
        }
        
        TreeNode leftNode = dfs(node.left,set,result);
        TreeNode rightNode = dfs(node.right,set, result);
        
        if(set.contains(node.val)){
            if(leftNode != null){
                result.add(leftNode);
            }
            if(rightNode != null){
                result.add(rightNode);
            }
            return null;
        }
        TreeNode newNode = new TreeNode(node.val);
        newNode.left = leftNode;
        newNode.right = rightNode;
        
        return newNode;
    }
}
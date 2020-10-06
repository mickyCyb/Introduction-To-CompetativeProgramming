public class PathSumII{
	public static void main(String[] args) {
		
	}
}

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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null){
            return result;
        }
        hasPathSum(root,sum,new ArrayList<Integer>(),result);
        return result;
    }
    public void hasPathSum(TreeNode root,int sum,List<Integer>singlePath, List<List<Integer>> result){
        if(root == null){
            return;
        }
        
        singlePath.add(root.val);
        
        if(root.val == sum && root.left == null && root.right == null){
            result.add(singlePath);
            return;
        }
        hasPathSum(root.left, sum-root.val,new ArrayList<Integer>(singlePath),result);
        hasPathSum(root.right, sum-root.val,new ArrayList<Integer>(singlePath),result);
        
    }
}
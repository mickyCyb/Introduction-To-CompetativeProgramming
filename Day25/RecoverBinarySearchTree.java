
public class RecoverBinarySearchTree {
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
class SolutionRecoverBinarySearchTree {
    
    TreeNode first = null;
    TreeNode second = null;
    int previousValue = Integer.MIN_VALUE;
    
    public void recoverTree(TreeNode root) {
        
        inorderTraversal(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
    }
    
    public void inorderTraversal(TreeNode node){
        
        if(node == null){
            return;
        }
        inorderTraversal(node.left);

        if(previousValue > node.val){
            second = node;
        }
        if(second == null){
            first = node;
        }
        previousValue = node.val;
        
        inorderTraversal(node.right);
    }
}
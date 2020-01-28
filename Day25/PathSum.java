/**
 * PathSum
 */
public class PathSum {

    public static void main(String[] args) {
        
        SolutionPathSum solutionPathSum = new SolutionPathSum();

        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(8);

        treeNode.left.left = new TreeNode(11);
        treeNode.left.left.right = new TreeNode(2);

        treeNode.left.left.left = new TreeNode(7);
        
        treeNode.right.left = new TreeNode(13);
        treeNode.right.right = new TreeNode(4);

        treeNode.right.right.right = new TreeNode(1);

        boolean ans = solutionPathSum.hasPathSum(treeNode, 22);
        System.out.println(ans);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    }

class SolutionPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {

        if(root == null){
            return false;
        }
        else if(root.left == null && root.right == null && sum - root.val == 0){
            return true;
        }else{
        
            return hasPathSum(root.left, sum- root.val) || hasPathSum(root.right, sum - root.val);
        
        } 
        
    }
}
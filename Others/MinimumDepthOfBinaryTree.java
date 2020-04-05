import java.util.*;
public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        SolutionMinimumDepthOfBinaryTree min = new SolutionMinimumDepthOfBinaryTree();
        int ans1 = min.minDepth(treeNode);
        System.out.println(ans1);
    }
}


// class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) { val = x; }
// }

class SolutionMinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        //return getMinDepthRecursive(root);
        return getMinDepthIterrative(root);
    }
    
    public int getMinDepthRecursive(TreeNode node){
        if(node == null){
            return 0;
        }    
        if(node.left == null){
            return 1 + getMinDepthRecursive(node.right);
        }
        if(node.right == null){
            return 1 + getMinDepthRecursive(node.left);
        }

        return 1 + Math.min(getMinDepthRecursive(node.left), getMinDepthRecursive(node.right));
    }

    public int getMinDepthIterrative(TreeNode node){

        if(node == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        int maxDepth = 1;

        while(!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode n = queue.poll();
                // if we reach a node with no children we stop there and return the depth
                if(n.left == null && n.right == null){
                    return maxDepth;
                }
                if(n.left != null){
                    queue.add(n.left);
                }
                if(n.right != null){
                    queue.add(n.right);
                }
            }
            maxDepth++;
        }
        return maxDepth;
    }
}
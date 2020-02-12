/**
 * BinaryTreeRightSideView
 */
import java.util.*;
public class BinaryTreeRightSideView {

    public static void main(String[] args) {
        
    }
}


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class SolutionBinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        
        // list to hold the final right side trees
        List<Integer> rightSideTrees = new ArrayList<>();

        // a data structure to implement BFS
        Queue<TreeNode> queue = new LinkedList<>();
        int size=0;

        if(root == null){
            return rightSideTrees;
        }
        queue.add(root);

        while(!queue.isEmpty()){
            size= queue.size();

            for(int i=1; i<= size;i++){
                TreeNode currentNode = queue.remove();
                
                // check if we have reached the last element for the specific set of queue size
                if(i == size){
                    rightSideTrees.add(currentNode.val);
                }
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.add(currentNode.right);
                }
            }
        }



        return rightSideTrees;
    }
}
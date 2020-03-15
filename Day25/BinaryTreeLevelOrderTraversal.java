/**
 * BinaryTreeLevelOrderTraversal
 */
import java.util.*;
public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {
        
    }
}


class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
}
// BFS approach was used for this problem
class SolutionBinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levelOrderList = new ArrayList<>();
        
        if(root ==null){
            return levelOrderList;
        }
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            List<Integer> innerList = new ArrayList<>();
            int queueSize = queue.size();
            // the inner list is filled up here from nodes we get from each level of the tree
            for(int i=0;i<queueSize;i++){
                
                TreeNode currentNode = queue.remove();
                innerList.add(currentNode.val);
                
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                
                if(currentNode.right !=null){
                    queue.add(currentNode.right);
                }
            }
            levelOrderList.add(innerList);
        }
        
        return levelOrderList ;
    }
}
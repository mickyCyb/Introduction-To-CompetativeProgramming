/**
 * BinaryTreeLevelOrderTraversalII
 */
import java.util.*;
public class BinaryTreeLevelOrderTraversalII {

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
class SolutionBinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levelOrderList = new ArrayList<>();
        Stack<List<Integer>> stack = new Stack<>();
        
        if(root ==null){
            return levelOrderList;
        }
        
        queue.add(root);
         List<Integer> innerList;
         // the inner list is filled up here from nodes we get from each level of the tree
        while(!queue.isEmpty()){
            
            innerList = new ArrayList<>();
            int queueSize = queue.size();
            
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
            stack.push(innerList);
            
        }
        // the stack is used to get the list in reverse order.
        while(!stack.isEmpty()){
            levelOrderList.add(stack.pop());
        }
        
        return levelOrderList ;
    }
}
/**
 * IncreasingOrderSearchTree
 */
import java.util.*;
public class IncreasingOrderSearchTree {

    public static void main(String[] args) {
        
    }
}


// Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 
class SolutionIncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {

        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode finalTree =null;
        TreeNode currentInOrderNode =null;
        TreeNode node = root;

        while(node!=null || !stack.empty()){

            if(node!=null){
                stack.push(node);
                node = node.left;
            }
            else{
                node = stack.pop();
                if(finalTree == null){
                    finalTree = new TreeNode(node.val);
                    currentInOrderNode = finalTree;

                }
                else{
                    currentInOrderNode.right = new TreeNode(node.val);
                    currentInOrderNode = currentInOrderNode.right;
                }

                node = node.right;
                
            }
              
        }       

        return finalTree;
    }
}
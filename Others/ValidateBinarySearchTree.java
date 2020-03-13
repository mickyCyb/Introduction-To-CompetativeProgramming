/**
 * ValidateBinarySearchTree
 */
import java.util.*;
public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        SolutionValidateBinarySearchTree valid =  new SolutionValidateBinarySearchTree();
        TreeNode node = new TreeNode(2);
        node.left = new TreeNode(1);
        node.right = new TreeNode(3);
        boolean ans = valid.isValidBST(node);// expected answer is true
        System.out.println(ans);
    }
}


class SolutionValidateBinarySearchTree {
    // An ArrayList to hold all the values that we collect from the tree(In-Order traversal).
    ArrayList<Integer> listOfNodes = new ArrayList<>();
    
    public boolean isValidBST(TreeNode root) {
        
        // empty tree is considered valid
        if(root == null){
            return true;
        }
        add(root);
        for(int i=0;i< listOfNodes.size()-1;i++){ // if the collected node values are not sorted in ascending order then the tree isn't valid
            if(listOfNodes.get(i+1)<= listOfNodes.get(i)){
                return false;
            }
        }
        
        return true;
    }
    
    // a function to implement inorder travseral
    public void add(TreeNode node){
        
        if(node == null){
            return;
        }
        add(node.left);
        listOfNodes.add(node.val);
        add(node.right);
        
    }
    
            
}
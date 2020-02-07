/**
 * AllElementsInTwoBinarySearchTrees
 */
import java.util.*;
public class AllElementsInTwoBinarySearchTrees {

    public static void main(String[] args) {
        
        SolutionAllElements all = new SolutionAllElements();
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right= new TreeNode(4);
        

    }
}


//Definition for a binary tree node.
 class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class SolutionAllElements {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> list = new ArrayList<>();
        if(root1==null && root2==null){
            return list;
        }
        

        Stack<TreeNode> stack = new Stack<>();     
        //List<Integer> list = new ArrayList<>();

        TreeNode newNode = null;

        if(root1!=null){
        stack.push(root1);

        while(!stack.empty()){
            newNode = stack.pop();
            list.add(newNode.val);

            if(newNode.left!=null){
                stack.push(newNode.left);
            }

            if(newNode.right!=null){
                stack.push(newNode.right);
            }
        }
        Collections.sort(list);
    }

    if(root2!=null){
        stack.push(root2);

        while(!stack.empty()){
            newNode = stack.pop();
            list.add(newNode.val);

            if(newNode.left!=null){
                stack.push(newNode.left);
            }

            if(newNode.right!=null){
                stack.push(newNode.right);
            }
        }

        Collections.sort(list);
       }
        return list;


    }
}
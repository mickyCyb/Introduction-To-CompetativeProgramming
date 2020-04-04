import java.util.*;
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        SolutionSymmetricTree sym = new SolutionSymmetricTree();
        boolean ans1 = sym.checkSymmetric(treeNode.left, treeNode.right);
        boolean ans2 = sym.checkSymmetricIterative(treeNode);
        //System.out.println(ans1);
        System.out.println(ans2);
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
 
class SolutionSymmetricTree {
    public boolean isSymmetric(TreeNode root) {
     if(root == null || root.left ==null && root.right == null){
         return true;
     }   
        //return checkSymmetric(root.left, root.right); // recursive
        return checkSymmetricIterative(root);//iterative
    }
    
    public boolean checkSymmetric(TreeNode leftNode, TreeNode rightNode){ //recursive
       
        if(leftNode == null || rightNode == null){
            return leftNode == rightNode;
        }
        if(leftNode.val != rightNode.val){
            return false;
        }
        
        return checkSymmetric(leftNode.left,rightNode.right) && checkSymmetric(leftNode.right,rightNode.left);
    }

    public boolean checkSymmetricIterative(TreeNode node){// iterative

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(node);

        while(!queue.isEmpty()){
            TreeNode n1 = queue.poll();
            TreeNode n2 = queue.peek();

            if(n1 == null && n2 == null){
                continue;
            }
            if(n1 == null || n2 == null){
                return false;
            }
            if(n1.val != n2.val){
                return false;
            }

            queue.add(n1.left);
            queue.add(n2.right);
            queue.add(n1.right);
            queue.add(n2.left);
        }
        return true;
    }
    
}
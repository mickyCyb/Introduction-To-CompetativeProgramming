import java.util.ArrayList;
import java.util.List;

/**
 * BinaryTreePostOrderTraversal
 */
public class BinaryTreePostOrderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);

        SolutionPostorderTraversal solutionPostorderTraversal = new SolutionPostorderTraversal();
        List<Integer> result = solutionPostorderTraversal.postorderTraversal(treeNode);

        for(int i=0; i< result.size(); i++){
            System.out.print(result.get(i));
            System.out.print(",");
        }


    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class SolutionPostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> myList = new ArrayList<>();
        List<Integer> leftList = null;
        List<Integer> rightNode = null;

        if(root == null){
            return myList;
        }

        if(root.left != null){
            leftList = postorderTraversal(root.left);
        }

        if(root.right != null){
            rightNode = postorderTraversal(root.right);
        }

        if(leftList != null){
            myList.addAll(leftList);
        }

        if(rightNode != null){
            myList.addAll(rightNode);
        }
        myList.add(root.val);

        return myList;
    }
}
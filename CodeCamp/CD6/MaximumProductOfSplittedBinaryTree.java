/**
 * MaximumProductOfSplittedBinaryTree
 */
import java.util.*;
public class MaximumProductOfSplittedBinaryTree {

    public static void main(String[] args) {
        
        SolutionMaximumProduct sm = new SolutionMaximumProduct();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);

        treeNode.right.left = new TreeNode(6);
        
        int ans = sm.maxProduct(treeNode);
        System.out.println(ans);
    }
}


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class SolutionMaximumProduct {
    public int maxProduct(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        int maxVal = getSubTreeSum(root, list);
        // int max = getSubTreeSum(root, list);

        // int maxProduct =0;
        // for(int j: list){

        //     if((max - j) * j >maxProduct){
        //         maxProduct = ((max - j) * j);
        //     }
        // }
        // return maxProduct;
        int minDiff = Integer.MAX_VALUE, firstNum = 0, secondNum = 0;
        for (int i : list) {
            int first = maxVal - i;
            int second = i;

            if (Math.abs(second - first) < minDiff) {
                minDiff = Math.abs(second - first);
                firstNum = first;
                secondNum = second;
            }
        }
        Double n = ((double) firstNum * (double) secondNum) % (1000000007);
        Integer maxProduct = n.intValue();
        return maxProduct;
    }
        
    

    public int getSubTreeSum(TreeNode node, List<Integer> list){

        int leftNodeVal=0;
        int rightNodeVal=0;

        if(node == null){
            return 0;
        }

        if(node.left != null){
            leftNodeVal = getSubTreeSum(node.left, list);
        }

        if(node.right != null){
            rightNodeVal = getSubTreeSum(node.right, list);
        }

        list.add(leftNodeVal + rightNodeVal + node.val);

        return leftNodeVal + rightNodeVal + node.val;
    }


    
}
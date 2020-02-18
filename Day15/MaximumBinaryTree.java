/**
 * MaximumBinaryTree
 */
import java.util.*;
public class MaximumBinaryTree {

    public static void main(String[] args) {
        SolutionMaximumBinaryTree solutionMaximumBinaryTree = new SolutionMaximumBinaryTree();
        solutionMaximumBinaryTree.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class SolutionMaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    
        if(nums.length == 0){
            return null;
        }
        if(nums.length ==1){
            return new TreeNode(nums[0]);
        }
        
        int maxNodeVal=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] > nums[maxNodeVal]){
                maxNodeVal = i;
            }
        }
        System.out.println(nums[maxNodeVal] +" <-max");

        TreeNode node = new TreeNode(nums[maxNodeVal]);

        node.left =constructMaximumBinaryTree( Arrays.copyOfRange(nums, 0, maxNodeVal) );
        node.right =constructMaximumBinaryTree( Arrays.copyOfRange(nums, maxNodeVal +1, nums.length) );


        return node;
    }
}
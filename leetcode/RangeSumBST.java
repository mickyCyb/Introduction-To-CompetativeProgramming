/**
 * RangeSumBST
 */
public class RangeSumBST {

    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(15);

        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(11);

        treeNode.right.right = new TreeNode(18);

        SolutionRangeSumBST solutionRangeSumBST = new SolutionRangeSumBST();
       int result = solutionRangeSumBST.rangeSumBST(new TreeNode(10), 7, 15);
       System.out.println(result);
    }

}

 class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
   

class SolutionRangeSumBST {

    //  Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
    //  Output: 32
    public int rangeSumBST(TreeNode root, int L, int R) {
        
        int sum =0;

        if(root == null){
            return 0;
        }
        if(root != null && root.val >= L && root.val <= R){ // check if the root isn't null or meets the condition.
            sum += root.val;
        }
         if(root.left !=null && root.val>=L){   //check if the left side isn't null and the rest of the node isn't less than L.
            sum += rangeSumBST(root.left, L, R);

        }
         if(root.right !=null && root.val<=R){  //check if the right side isn't null and the rest of the node isn't greater than R.
            sum += rangeSumBST(root.right, L, R);

        }

        return sum;
    }
}
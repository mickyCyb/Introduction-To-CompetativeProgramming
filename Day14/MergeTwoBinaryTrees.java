/**
 * MergeTwoBinaryTrees
 */
public class MergeTwoBinaryTrees {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(3);
        treeNode1.right = new TreeNode(2);

        treeNode1.left.left = new TreeNode(5);
        // treeNode.left.right = new TreeNode(7);

        // treeNode.right.right = new TreeNode(18);
        // treeNode.right.left = new TreeNode(3);

        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);

        // treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);

        treeNode.right.right = new TreeNode(7);
        // treeNode.right.left = new TreeNode(3);

        TreeNode n = new Solution().mergeTrees(treeNode1, treeNode);

        print(n);

    }

    public static void print(TreeNode n) {
        System.out.println(n.val + "=> node ");

        if (n.left != null) {
            print(n.left);
        }

        if (n.right != null) {
            print(n.right);
        }
        
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        TreeNode t3 = null;

        // create the root of the third TreeNode after checking all conditions
        if(t1 ==null && t2!=null){
            t3 = new TreeNode(t2.val);

        }
        else if(t1!=null && t2 ==null){
            t3 = new TreeNode(t1.val);
        }
        else if(t1!=null && t2 !=null){
            t3 = new TreeNode(t1.val+t2.val);

        }else{
            return null;
        }

        TreeNode t1Left, t1Right, t2Left, t2Right;

        // nodes of t1
        if(t1!=null){
            t1Left = t1.left;
        }else{
            t1Left =null;
        }

        if(t1!=null){
            t1Right = t1.right;
        }else{
            t1Right =null;
        }
        //nodes of t2
        if(t2!=null){
            t2Left = t2.left;
        }else{
            t2Left =null;
        }

        if(t2!=null){
            t2Right = t2.right;
        }else{
            t2Right =null;
        }

        // recursively call mergeTrees until base case is reached.
        t3.left = mergeTrees(t1Left, t2Left);
        t3.right = mergeTrees(t1Right, t2Right);
        
        return t3;
    }
        
        
}  


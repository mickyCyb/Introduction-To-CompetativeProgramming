/**
 * LowestCommonAncestor
 */
public class LowestCommonAncestor {

    public static void main(String[] args) {
        SolutionLowestAncestor sla = new SolutionLowestAncestor();

      //  6,2,8,0,4,7,9,null,null,3,5
        TreeNode tn = new TreeNode(6);
        tn.left = new TreeNode(2);
        tn.right = new TreeNode(8);
        tn.left.left = new TreeNode(0);
        tn.left.right = new TreeNode(4);
        tn.left.right.left = new TreeNode(3);
        tn.left.right.right = new TreeNode(5);

        tn.right.left = new TreeNode(7);
        tn.right.right = new TreeNode(9);

        TreeNode tnP = new TreeNode(2);
        TreeNode tnQ = new TreeNode(8);

        int ans =sla.lowestCommonAncestor(tn,tnP,tnQ).val;
       System.out.println(ans);

    }
}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class SolutionLowestAncestor {

    //  Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
    //  Output: 6

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode leftTreeNode = null, rightTreeNode = null;

        if(root == null){
            return null;
        }
        
        if(root.val == p.val || root.val == q.val){
            return root;

        }

        if(root.left !=null){
            leftTreeNode = lowestCommonAncestor(root.left, p, q);

        }

        if(root.right !=null){
            rightTreeNode = lowestCommonAncestor(root.right, p, q);

        }
        if(leftTreeNode != null && rightTreeNode !=null){
            return root;
        }

        if(rightTreeNode != null){
            return rightTreeNode;
        }
        return leftTreeNode;
    }

    // efficient solution

     // if(root.val > p.val && root.val > q.val){
     //        return lowestCommonAncestor(root.left,p,q);
     //    }
        
     //    if(root.val < p.val && root.val < q.val){
     //        return lowestCommonAncestor(root.right,p,q);
     //    }
     //    return root;
   }
/**
 * SameTree
 */
public class SameTree {

    public static void main(String[] args) {

        SolutionSameTree solution = new SolutionSameTree();
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.left = new TreeNode(2);
        treeNode1.right = new TreeNode(3);
        treeNode1.left.left = new TreeNode(4);
        

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.left = new TreeNode(2);
        treeNode2.right = new TreeNode(3);
        treeNode2.left.left = new TreeNode(4);
        
        boolean res = solution.isSameTree(treeNode1, treeNode2);
        System.out.println(res);
        
    }
}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
    
class SolutionSameTree {
       public boolean isSameTree(TreeNode p, TreeNode q) {
           boolean checkLeftTreeNode = true, checkRightTreeNode = true;

        if( p == null && q == null ){
            return true;
        }
        else if( (p!=null && q ==null) || (p ==null && q!=null) || (p.val != q.val)){
            return false;

        }
        
        TreeNode pLeft, qLeft, pRight, qRight;

        if(p !=null) { pLeft = p.left;} else{ pLeft = null;}

        if(q !=null) { qLeft = q.left;} else{ qLeft = null;}

        if(p !=null) { pRight = p.right;} else{ pRight = null;}

        if(q !=null) { qRight = q.right;} else{ qRight = null;}

        checkLeftTreeNode = isSameTree(pLeft, qLeft);
        checkRightTreeNode = isSameTree(pRight, qRight);
    
        return checkLeftTreeNode && checkRightTreeNode;
           
       }
}
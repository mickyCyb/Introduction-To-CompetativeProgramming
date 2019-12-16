/**
 * InsertInToBST
 */
public class InsertInToBST {

    public static void main(String[] args) {
        SolutionInsertIntoBST solutionInsertIntoBST = new SolutionInsertIntoBST();
        TreeNode treeNodeMain = new TreeNode(4);
        treeNodeMain.left = new TreeNode(2);
        treeNodeMain.right = new TreeNode(7);

        treeNodeMain.left.left = new TreeNode(1);
        treeNodeMain.left.right = new TreeNode(3);

        TreeNode result = solutionInsertIntoBST.insertIntoBST(treeNodeMain, 5);

        print(result);

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

class SolutionInsertIntoBST {
       public TreeNode insertIntoBST(TreeNode root, int val) {

      //  TreeNode tNode =null;
        TreeNode leftTreeNode = null, rightTreeNode = null;

        if(root == null){
           return  new TreeNode(val);
        }

        if(root != null && root.val <= val){
            rightTreeNode = insertIntoBST(root.right, val);
        }

        if(root !=null && root.val >= val){
            leftTreeNode = insertIntoBST(root.left, val);
        }

        if(leftTreeNode != null){
            root.left = leftTreeNode;
        }

        if(rightTreeNode != null){
            root.right = rightTreeNode;
        }

           
        return root;
        }
   }
/**
 * SearchInBST
 */
public class SearchInBST {

    public static void main(String[] args) {
        
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode newLeftTreeNode  = null;
        TreeNode newRightTreeNode = null;

        if(root == null){   // if the root node is null, return null
            return null;
        }

        if(root.val == val){    // if the given value is found at the root, return the root.
            return root;
        }

        if(root.left!=null){    // check if the value is found in the left TreeNodes
            
            newLeftTreeNode = searchBST(root.left, val);
        }
        if(root.right!=null){   // check if the value is found in the right TreeNodes
            
            newRightTreeNode = searchBST(root.right, val);
        }

        if(newRightTreeNode !=null){    // if the right TreeNode satisfies the condition return the tree
            return newRightTreeNode;
        }


        return newLeftTreeNode;
    }
}
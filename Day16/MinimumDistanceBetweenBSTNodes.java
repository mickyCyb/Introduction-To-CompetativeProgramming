import java.util.ArrayList;
import java.util.Collections;   

/**
 * MinimumDistanceBetweenBSTNodes
 */
public class MinimumDistanceBetweenBSTNodes {

    public static void main(String[] args) {
        
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(20);
        treeNode.right = new TreeNode(60);

        treeNode.left.left = new TreeNode(10);
        treeNode.left.right = new TreeNode(30);
        
        

        System.out.println(new SolutionMin().minDiffInBST(treeNode));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class SolutionMin {
    public int minDiffInBST(TreeNode root) {
        
        int minNumber;
        ArrayList<TreeNode> nodeList = new ArrayList<>();
        ArrayList<Integer> nodeListValues = new ArrayList<>();

        nodeList.add(root);

        while( !(nodeList.size() == 0)){
            TreeNode node = nodeList.remove(nodeList.size() - 1);
            
            nodeListValues.add(node.val);

            if(node.left !=null){
                nodeList.add(node.left);
            }
    
            if(node.right !=null){
                nodeList.add(node.right);
            }
           
        }

        Collections.sort(nodeListValues);
        minNumber = Integer.MAX_VALUE;

        for(int i=0; i< nodeListValues.size()-1; i++){
            if(nodeListValues.get(i+1) - nodeListValues.get(i) < minNumber){
                minNumber = nodeListValues.get(i+1) - nodeListValues.get(i);
            }
        }

        return minNumber;
      }
    }
   

		// efficient solution - faster than 100%
//    class Solution {
//     int min = Integer.MAX_VALUE;
//     TreeNode previousNode = null;
//     public int minDiffInBST(TreeNode root) {
        
//         inorder(root);
//         return min;
//     }
//     public void inorder(TreeNode node){
//         if(node == null){
//             return;
//         }
//         inorder(node.left);
//         if(previousNode != null && Math.abs(previousNode.val - node.val) < min){
//             min = Math.abs(previousNode.val - node.val);
//         }
//         previousNode = node;
//         inorder(node.right);
//     }
// }
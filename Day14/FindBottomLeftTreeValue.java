import java.util.*;

/**
 * FindBottomLeftTreeValue
 */
public class FindBottomLeftTreeValue {

    public static void main(String[] args) {
        
        SolutionBottomLeftTreeValue sblt = new SolutionBottomLeftTreeValue();
        TreeNode treeNode = new TreeNode(2);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(3);
        int ans = sblt.findBottomLeftValue(treeNode);
        System.out.println(ans);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class SolutionBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
    
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.offer(root);

        while(!myQueue.isEmpty()){
            root = myQueue.poll();
            if(root.right !=null){
                myQueue.offer(root.right);
            }
            if(root.left !=null){
                myQueue.offer(root.left);
            }
            
        }  
        return root.val;
       }
   }
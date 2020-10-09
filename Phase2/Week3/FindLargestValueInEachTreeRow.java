public class FindLargestValueInEachTreeRow{
	public static void main(String[] args) {
		
	}
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        if(root ==null){
            return result;
        }
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            List<Integer> innerList = new ArrayList<>();
            int queueSize = queue.size();
            // the inner list is filled up here from nodes we get from each level of the tree
            for(int i=0;i<queueSize;i++){
                
                TreeNode currentNode = queue.remove();
                innerList.add(currentNode.val);
                
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                
                if(currentNode.right !=null){
                    queue.add(currentNode.right);
                }
            }
            int x = Collections.max(innerList);
            result.add(x);
        }
        
        return result ;
    }
}
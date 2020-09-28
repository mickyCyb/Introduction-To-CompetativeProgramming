public class BinaryTreeZigzagLevelOrderTraversal{
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
// 76% faster
class SolutionBinaryTreeZigzagLevelOrderTraversal {
	// using List and Queue
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root ==null){
            return result;
        }
        
        queue.add(root);
        // use a boolean or a flag to know where the zigzag happens(on odd levels)
        int j=0;
        while(!queue.isEmpty()){
            
            List<Integer> innerList = new ArrayList<>();
            int queueSize = queue.size();
            
            for(int i=0;i<queueSize;i++){
                TreeNode currentNode = queue.remove();
                
                // if the level index is odd, add to the beginning of the list
                // to have reversed order
                if(j%2 ==0){
                    innerList.add(currentNode.val);
                }
                else{
                    innerList.add(0,currentNode.val);
                }
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }       
            }
            j++;
            result.add(innerList);
        }
        
        return result ;
    }
}

// effiecient 100 % faster
class SolutionSolutionBinaryTreeZigzagLevelOrderTraversal {
    // using Deque and Linked List as inner List
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Deque<TreeNode> deque = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        
        if(root ==null){
            return result;
        }
        
        deque.add(root);
        // use a boolean or a flag to know where the zigzag happens(on odd levels)
        int j=0;
        while(!deque.isEmpty()){
            
            LinkedList<Integer> innerList = new LinkedList<>();
            int queueSize = deque.size();
            
            for(int i=0;i<queueSize;i++){
                TreeNode currentNode = deque.removeFirst();
                
                // if the level index is odd, add to the beginning of the list
                // to have reversed order
                if(j%2 ==0){
                    innerList.addLast(currentNode.val);
                }
                else{
                    innerList.addFirst(currentNode.val);
                }
                if(currentNode.left != null){
                    deque.add(currentNode.left);
                }
                if(currentNode.right != null){
                    deque.add(currentNode.right);
                }       
            }
            j++;
            result.add(innerList);
        }
        
        return result ;
    }
}
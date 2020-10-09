public class BinarySearchTreeIterator{
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
// since it is binary search tree, any root.left nodes are smaller in value. so add them to
// stack first and when finished add the right ones(go to the right and add those node's left values too)
class BSTIterator {

    Stack<TreeNode> stack;
    TreeNode node;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        node = root;
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        int next=-1;
        if(!stack.isEmpty()){
            node = stack.pop();
            next = node.val;
            node = node.right;
            
            while(node != null){
                stack.push(node);
                node = node.left;
            }
        }
        return next;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
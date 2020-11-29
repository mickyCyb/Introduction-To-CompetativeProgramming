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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< inorder.length; i++){
            map.put(inorder[i],i);
        }
        int len = preorder.length;
        return createTree(0, 0, len, preorder, inorder, map);
    }
    public TreeNode createTree(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder, HashMap<Integer,Integer> map){
        if(inStart >= inEnd){
            return null;
        }
        
        TreeNode node = new TreeNode(preorder[preStart]);
        int inPos = map.get(preorder[preStart]);
        
        if(inStart < inEnd){
            node.left = createTree(preStart+1,inStart, inPos,preorder,inorder,map);
        }
        
        if(inPos < inEnd){
            int leftSubTreeElements = inPos - inStart;
            node.right= createTree(preStart + leftSubTreeElements+1, inPos+1,inEnd,preorder,inorder,map);
        }
        return node;
    }
}
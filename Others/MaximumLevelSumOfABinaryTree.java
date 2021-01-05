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
    // dfs solution
    public int maxLevelSum(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        getMaxLevel(root,1,map);
        int level=0;
        int sum =Integer.MIN_VALUE;
        for(int key : map.keySet()){
            if(map.get(key) > sum){
                sum = map.get(key);
                level = key;
            }
        }
        return level;
    }
    public void getMaxLevel(TreeNode root, int depth, HashMap<Integer,Integer> map){
        if(root == null){
            return;
        }
         
        map.put(depth,map.getOrDefault(depth,0) + root.val);
        getMaxLevel(root.left,depth+1,map);
        getMaxLevel(root.right, depth+1, map);
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
    // bsf solution
    public int maxLevelSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level =0;
        int sum = Integer.MIN_VALUE;
        int result =0;
        
        while(!queue.isEmpty()){
            int size = queue.size();
            level++;
            int tempLevelSum = 0;
            for(int i=0; i< size; i++){
                TreeNode curr = queue.remove();
                tempLevelSum += curr.val;
                
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
                
            }
            if(tempLevelSum > sum){
                sum = tempLevelSum;
                result = level;
            }
        }
        return result;
    }
}
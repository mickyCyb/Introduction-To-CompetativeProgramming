/**
 * BinaryTreePaths
 */
import java.util.List;
import java.util.ArrayList;
public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.right = new TreeNode(5);
        SolutionBinaryTreePaths solutionBinaryTreePaths = new SolutionBinaryTreePaths();
        solutionBinaryTreePaths.binaryTreePaths(node);
    }
    
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
 
class SolutionBinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        
        if(root == null){
            return paths;
        }
        
        getAllPaths(root,paths, "");
        // for(int i=0;i<paths.size();i++){
        //     System.out.println(paths.get(i));
        // }
        return paths;
    }
    
    public void getAllPaths(TreeNode node, List<String> paths, String singlePath){
        
        singlePath += node.val;
        
        if(node.left == null && node.right == null){
            paths.add(singlePath);
            return;
        }
        
        if(node.left != null){
            getAllPaths(node.left,paths,singlePath+"->");
        }
        
        if(node.right != null){
            getAllPaths(node.right,paths,singlePath+"->");
        }
        
    }
}
    // better answer with string builder
// class Solution {
//     public List<String> binaryTreePaths(TreeNode root) {
//         List<String> paths = new ArrayList<>();
//         StringBuilder builder = new StringBuilder();
//         if(root == null){
//             return paths;
//         }
        
//         getAllPaths(root,paths, builder);
        
//         return paths;
//     }
    
//     public void getAllPaths(TreeNode node, List<String> paths, StringBuilder singlePath){
//          if (node == null){
//              return;
//          }
//         int len = singlePath.length();
//         singlePath.append(node.val);

//         if(node.left == null && node.right == null){
//            paths.add(singlePath.toString());
//         }
//         else{
//             singlePath.append("->");
//             getAllPaths(node.left, paths, singlePath);
//             getAllPaths(node.right, paths, singlePath);    
//         }
        
//         singlePath.setLength(len);
        
//     }
// }
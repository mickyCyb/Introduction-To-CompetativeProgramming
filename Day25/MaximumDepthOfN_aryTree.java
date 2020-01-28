/**
 * MaximumDepthOfN-aryTree
 */

 import java.util.*;
public class MaximumDepthOfN_aryTree {

    public static void main(String[] args) {
        
       
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
class SolutionMaximumDepth {
    
    int maxDepth;
    public int maxDepth(Node root) {
        
        if(root == null){
            return 0;
        }
        getMaxDepth(root, 1);
        return maxDepth;
    }

    public void getMaxDepth(Node node, int depth){

        if(node == null){

            return;
        }
        maxDepth = Math.max(depth, maxDepth);
        for(Node child : node.children){
            getMaxDepth(child, depth+1);
        }
    }
}
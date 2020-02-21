/**
 * DistributeCoinsInBinaryTree
 */
public class DistributeCoinsInBinaryTree {

    public static void main(String[] args) {
        
    }
}


//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class SolutionDistributeCoinsInBinaryTree {
    public int distributeCoins(TreeNode root) {
        
        State t = new State(0, 0);
        
        calculateMoves(t, root);

        return t.move;
    }

    public int calculateMoves(State state, TreeNode node){

        if(node.left == null && node.right == null){

            int val = node.val;
            state.coinAmount = val - 1;
            state.move += Math.abs(val -1);

            return val - 1;
        }

        int leftVal = 0;
        int rightVal = 0;

        if(node.left != null){
            leftVal = calculateMoves(state, node.left);
        }

        if(node.right != null){
            rightVal = calculateMoves(state, node.right);
        }

        int ans  = leftVal + rightVal + (node.val - 1);
        state.move += Math.abs(ans);



        return ans;
    }

    
}

class State{

    int move;
    int coinAmount;
    public State(int m, int c){
        this.move = m;
        this.coinAmount =c;
    }
}



/**
 * UniqueBinarySearchTrees
 */
public class UniqueBinarySearchTrees {

    public static void main(String[] args) {
        
        SolutionUniqueBinarySearchTrees  unique = new SolutionUniqueBinarySearchTrees();
        int ans = unique.numTrees(3);
        System.out.println(ans);

    }
}

class SolutionUniqueBinarySearchTrees {
    public int numTrees(int n) {
        /*
                    3
    leftSide     2  *   0    rightSide
                 1  *   1
                 0  *   2 
        
        */
        // because 0 is included and is initialized as 1
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;

        return subUniqueTrees(n,arr);
    }

    public int subUniqueTrees(int n,int[]arr){

        int uniqueTrees =0;
        if(arr[n]==0){
            // left side starts with 1 less than n
            // right side starts from 0 for each function call 
            int leftSide = n-1;
            int rightSide =0;

            while(leftSide>=0 && rightSide<n){
                // number of unique trees gets updated here
                uniqueTrees += subUniqueTrees(rightSide, arr) * subUniqueTrees(leftSide, arr);

                leftSide--;
                rightSide++;
            }
            arr[n] = uniqueTrees;
        }

        // the last element in the memoized array is the result for a given n
        return arr[n];
    }
}
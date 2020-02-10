import java.util.Stack;

/**
 * JumpGameV
 */
public class JumpGameV {

    public static void main(String[] args) {
        
        SolutionJumpGameV solutionJumpGameV = new SolutionJumpGameV();
        int ans = solutionJumpGameV.maxJumps(new int[]{6,4,14,6,8,13,9,7,10,6,12}, 2);
        System.out.println(ans);
    }
}

class SolutionJumpGameV {
    public int maxJumps(int[] arr, int d) {
        
        int maxJump =0;
        int[] coveredJump = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            maxJump= Math.max(maxJump,maxJumpOf(i,d,arr,coveredJump));
        }

        return maxJump;
    }


    public int maxJumpOf(int index, int d,int[]arr,int []coveredJump){

        int leftCover =0;
        int rightCover =0;
        if(coveredJump[index] ==0){

            for(int j= index -1; j>=0;j--){
                if(index - j > d || arr[j] >= arr[index] ){
                    break;
                }

                 leftCover = Math.max(leftCover, maxJumpOf(j, d, arr, coveredJump));

            }


            for(int k= index +1; k<arr.length;k++){
                if(k-index >d || arr[k] >= arr[index]){
                    break;
                }

                rightCover = Math.max(rightCover,maxJumpOf(k,d,arr,coveredJump));
            }

            coveredJump[index] = Math.max(leftCover, rightCover) +1;
        }



        return coveredJump[index];
    }
}
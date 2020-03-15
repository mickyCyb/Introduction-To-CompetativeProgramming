/**
 * LongestTurbulentSubarray
 */
public class LongestTurbulentSubarray {

    public static void main(String[] args) {
        SolutionLongestTurbulentSubarray turbulentSubarray = new SolutionLongestTurbulentSubarray();
        int ans = turbulentSubarray.maxTurbulenceSize(new int[]{9,4,2,10,7,8,8,1,9});
        System.out.println(ans);//9,4,2,10,7,8,8,1,9
    }
}

class SolutionLongestTurbulentSubarray {
    public int maxTurbulenceSize(int[] A) {
        
        if(A.length == 1){
            return 1;
        }

        int temp1 =0;
        int max =1;
        boolean isCorrect = false;
        boolean areNotEqual = false;

        for(int i=0; i< A.length - 1; i++){
            
           
            if(!areNotEqual){
                if(A[i] != A[i + 1]){
                    areNotEqual = true;

                    if(A[i] < A[i + 1]){
                        isCorrect = true;
                    }
                    else{
                        isCorrect = false;
                    }
                    
                   if(A[i] > A[i + 1]){
                        isCorrect = false;
                    }
                    else{
                        isCorrect = false;
                    }
                    temp1 = 1;                    
                }

                continue;
            }
            if(A[i] < A[i + 1]){
                if(!isCorrect){
                    temp1++;
                    isCorrect = true;
                }else{
                    max = Math.max(max, temp1 + 1);
                    temp1 = 1;
                }
            }else if(A[i] > A[i + 1]){
                if(isCorrect){
                    temp1++;
                    isCorrect = false;
                }else{
                    max = Math.max(max, temp1 + 1);
                    temp1 = 1;
                }
            }else{
                areNotEqual = false;
                max = Math.max(max, temp1 + 1);
                temp1 = 1;
            }            
        }
        
        max = Math.max(max, temp1 + 1);

            
        
        return max;
    }
}
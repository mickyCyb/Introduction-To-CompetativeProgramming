/**
 * FindNUniqueIntegersSumUpToZero
 */
public class FindNUniqueIntegersSumUpToZero {

    public static void main(String[] args) {
        SolutionFindUnique solutionFindUnique = new SolutionFindUnique();
        int[] ans = solutionFindUnique.sumZero(5);
        for(int i=0 ; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}

class SolutionFindUnique {
    public int[] sumZero(int n) {

        // can be improved from O(n) to O(n/2)

        int[] arr = new int[n];
            

            
        int counter = 0;
        for(int i=1; i<=n/2; i++){
            arr[counter++]=-1*(i);
            arr[counter++] =i;

        }

        return arr;
        
        // int[] arr = new int[n];
        // if(n==1){
        //     arr[0] =0;
        //     return arr;
        // }

        // if(n%2==0){
            
        //     int j=0;
        //     for(int i=(-n/2);i<=n/2;i++){
        //         if(i==0){
        //             continue;
        //         }
        //         arr[j] =i;
        //         j++;
        //     }
        // }

        // else{
        //     int j=0;
        //     for(int i=(-n/2);i<=n/2;i++){
                
        //         arr[j] =i;
        //         j++;
        //     }
        // }

        // return arr;
        
    }
}
/**
 * FlippingAnImage
 */
public class FlippingAnImage {
}

class SolutionFlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int rowSize = A.length;
        int columnSize = A[0].length;
        
        for(int row=0; row < rowSize; row++){
            int front =0;
            int last = A[0].length - 1;
            while(front < last){
                int num1 = A[row][front];
                A[row][front] = A[row][last];
                A[row][last] = num1;
                
                front ++;
                last --;
            }
            
            for(int i=0; i<columnSize;i++){
                
                if(A[row][i] ==1){
                    A[row][i] =0;
                }
                else{
                    A[row][i] =1;
                }
             
            }
        }
        
        return A;
    }
}
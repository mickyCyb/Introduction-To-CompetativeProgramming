class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int index = 0; // to keep track of where putting the even nubers at the front reached
        for(int i=0; i < A.length; i++){
            if(A[i] % 2 == 0){  // if it is even swap it to position of index, and vice versa
                int temp = A[index];
                A[index++] = A[i];
                A[i] = temp;
            }
        }
        return A;
    }
}
import java.util.HashMap;

import javax.sound.sampled.SourceDataLine;

/**
 * TheKWeakestRowsInAMatrix
 */
public class TheKWeakestRowsInAMatrix {

    public static void main(String[] args) {
        SolutionTheKWeakestRowsInAMatrix w = new SolutionTheKWeakestRowsInAMatrix();
        int []arr = w.kWeakestRows(new int[][]{
            new int[] {1,1,0,0,0},
            new int[] {1,1,1,1,0},
            new int[] {1,0,0,0,0},
            new int[] {1,1,0,0,0},
            new int[] {1,1,1,1,1}},3);

    }
}

class SolutionTheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum;
        int[] arr = new int[k];

        for(int i=0; i<mat.length; i++){
            sum=0;
            for(int j=0;j<mat[0].length; j++){
                sum +=mat[i][j];
            }
            map.put(i, sum);
        }

        // for (int i : map.keySet()) {
        //     // System.out.println(i + " : " + map.get(i));
        // }
        

        int min;
        int index;

        for(int i=0;i<k;i++){

            min = Integer.MAX_VALUE;
            index =0;
            for(int j : map.keySet()){
                if(map.get(j) <min){
                    index = j;
                    min = map.get(j);
                    // System.out.println("updating with " + j);
                }
            }
            // System.out.println("index " + index);
            // System.out.println("minval " + min);
            map.remove(index);

            // System.out.println("***********************");
            // for (int b : map.keySet()) {
            //     // System.out.println(b + " : " + map.get(b));
            // }
            
            arr[i] =index;
            
        }
        // for (int g : arr) {
        //     System.out.println("=> " + g);
        // }

        return  arr;
    }
}
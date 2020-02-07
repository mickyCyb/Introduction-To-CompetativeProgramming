/**
 * Triangle
 */
import java.util.*;
public class Triangle {

    public static void main(String[] args) {
        
    }

}

class SolutionTriangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int current;
        
        for(int i=triangle.size()-2; i>=0; i--){
            for(int j=0; j< triangle.get(i).size(); j++ ){
                
                current = triangle.get(i).get(j);
                
                int current2 = Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1))  + current;
                
                triangle.get(i).set(j, current2);

            }
        }

        return triangle.get(0).get(0);
    }
}
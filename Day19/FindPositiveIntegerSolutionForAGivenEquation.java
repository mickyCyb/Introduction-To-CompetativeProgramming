/**
 * FindPositiveIntegerSolutionForAGivenEquation
 */
public class FindPositiveIntegerSolutionForAGivenEquation {

    public static void main(String[] args) {
        
    }
}


/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int x=1; x<=1000; x++){
            if(customfunction.f(x,1) > z || customfunction.f(x,1000) < z){
                break;
            }
            
            int left = 1;
            int right = 1000;
            
            while(left < right){
                int y = (left + right)/2;
                int fz = customfunction.f(x,y);
                List<Integer> temp = new ArrayList<>();
                if(fz == z){
                    temp.add(x);
                    temp.add(y);
                    result.add(temp);
                    break;
                }
                if(fz > z){
                    right = y;
                }
                else{
                    left = y+1;
                }
            }
            
        }
        return result;
    }
}
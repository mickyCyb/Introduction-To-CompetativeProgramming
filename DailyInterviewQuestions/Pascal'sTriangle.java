import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> resultTriangle = new ArrayList<>();
        
        // if there is no row or clomun
        if(numRows == 0){
            return resultTriangle;
        }
        
        //populate the very first row with 1 and add it to the list
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        resultTriangle.add(firstRow);
        
        for(int i=1; i<numRows;i++){
            List<Integer> innerList = new ArrayList<>();
            innerList.add(1); // the beginning of every row is 1
            List<Integer> previousList = resultTriangle.get(i-1);
            
            for(int j=1; j<i; j++){
                innerList.add(previousList.get(j-1) + previousList.get(j));
            }
            innerList.add(1);
            resultTriangle.add(innerList);
        }
        return resultTriangle;
    }
}
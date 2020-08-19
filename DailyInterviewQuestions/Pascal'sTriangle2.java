class Solution {
    public List<Integer> getRow(int rowIndex) {
     
        
        List<List<Integer>> resultTriangle = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        // if there is no row or clomun
        if(rowIndex < 0){
            return res;
        }
        
        //populate the very first row with 1 and add it to the list
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        if(rowIndex == 0){
            return firstRow;
        }
        resultTriangle.add(firstRow);
        
        for(int i=1; i<=rowIndex;i++){
            List<Integer> innerList = new ArrayList<>();
            innerList.add(1); // the beginning of every row is 1
            List<Integer> previousList = resultTriangle.get(i-1);
            
            for(int j=1; j<i; j++){
                innerList.add(previousList.get(j-1) + previousList.get(j));
            }
            innerList.add(1);
            if(i == rowIndex){
                return innerList;
            }
            resultTriangle.add(innerList);
        }
        return res;
    }
}
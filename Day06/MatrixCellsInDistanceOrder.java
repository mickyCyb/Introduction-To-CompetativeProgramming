class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        
        int[][] resultCells = new int[R*C][2];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> coordinateList;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                int distance = Math.abs( (r0 - i) ) + Math.abs( (c0 -j) );
                int coordinate = i*C+j;
                if(!map.containsKey(distance)) {
                    coordinateList = new ArrayList<Integer>();
                } else {
                    coordinateList = map.get(distance);
                }
                coordinateList.add(coordinate);
                map.put(distance, coordinateList);
            }
        }
        
        int index=0;
        for(int key : map.keySet()){
            for(int i=0; i<map.get(key).size(); i++){
                int coord = map.get(key).get(i);
                int x = coord/C;
                int y = coord%C;
                resultCells[index++] = new int[]{x, y}; 
            }
        }
        return resultCells;
            
    }
}
class Solution {
    public int totalFruit(int[] tree) {
        int max = 1;
        int currentMax = 0;
        int prevFruit1 = -1;
        int prevFruit2 = -1;
        int prevFruit1Count = 0;
        
        for(int fruit : tree){
            // check if have 2 types of fruits only
            if(fruit == prevFruit1 || fruit == prevFruit2){
                currentMax++;
            }else{ // if there is a new fruit update the current fruit(prevFruit1)
                    //and currentMax with the occurence of the last fruit count
               // prevFruit1 = fruit;
                currentMax = prevFruit1Count +1;
            }
            // keep track of prevFruit1Count as we find new type of fruit(other than the 2 fruit               // type), we can use it to update currentMax
            if(fruit == prevFruit1){
                prevFruit1Count++;
            }else{
                prevFruit1Count =1;
            }
            // update prevFruit1 and prevFruit2 with new values because we found new type
            // of fruit
            if(fruit != prevFruit1){
                prevFruit2 = prevFruit1;
                prevFruit1 = fruit;
            }
            max = Math.max(max, currentMax);
        }
        return max;
    }
}
/**
 * MaximizeDistanceToClosestPerson
 */
public class MaximizeDistanceToClosestPerson {

    public static void main(String[] args) {
        SolutionMaximizeDistance solutionMaximizeDistance = new SolutionMaximizeDistance();
        int ans = solutionMaximizeDistance.maxDistToClosest(new int[]{0,0,0,1,0,0,0,1,0,1});
        System.out.println(ans);
    }
}

class SolutionMaximizeDistance {
    public int maxDistToClosest(int[] seats) {

        int maxDistance=0;
        int eachMin=0;
        boolean isMax= false;
        int prev=0;

        for(int i=0; i<seats.length; i++){
            
            if(seats[i] ==1){
                if(!isMax){
                    isMax =true;
                    maxDistance = Math.max(maxDistance, (i - 0));
                }
                else{
                    maxDistance = Math.max(maxDistance, ((i - prev) / 2));
                }
                prev =i;
            }
            

        }
        maxDistance = Math.max(maxDistance, (seats.length - (1 + prev)));

        return maxDistance;
        
    }
}
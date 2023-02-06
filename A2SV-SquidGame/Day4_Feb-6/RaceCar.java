import java.util.LinkedList;
import java.util.Queue;

public class RaceCar {
    
}
class Solution {
    public int racecar(int target) {

        Queue<int[]> queue = new LinkedList<>();        
        queue.add(new int[]{0,1,0});
        
        while(!queue.isEmpty()) {

            int[] pair = queue.poll();
            int position = pair[0];
            int speed = pair[1];
            int move = pair[2];

            if(position == target){
                return move;
            }
            queue.add(new int[]{position + speed, speed*2, move+1});
            if( (position + speed > target && speed > 0) || (position + speed < target && speed < 0)){
                queue.add(new int[]{position, speed > 0 ? -1 : 1, move+1});
            }
        }
        return 0;
    }
}
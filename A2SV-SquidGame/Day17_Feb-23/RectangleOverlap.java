
public class RectangleOverlap {
    
}
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        int overLapX =  Math.min(rec2[2] , rec1[2]) - Math.max(rec2[0] , rec1[0]);

        int overLapY =  Math.min(rec2[3] , rec1[3]) - Math.max(rec2[1] , rec1[1]);

        return overLapX > 0 && overLapY > 0;
    }
}
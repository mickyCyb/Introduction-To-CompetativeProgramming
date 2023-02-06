import java.util.*;
public class DetectSquares {

    HashMap<String, Integer> map;
    List<int[]> points;
    public DetectSquares() {
        points = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public void add(int[] point) {
        String key = point[0] + "." + point[1];
        map.put(key, map.getOrDefault(key, 0) + 1);
        points.add(point);
    }
    
    public int count(int[] point){
        int squares = 0;
        int px = point[0];
        int py = point[1];
        for(int[] p : points){
            int x = p[0];
            int y = p[1];
            if(px != x && py != y && (Math.abs(px - x) == Math.abs(py - y))){
                squares += map.getOrDefault(x + "." + py, 0) * map.getOrDefault(px + "." + y, 0);
            }
        }
        return squares;
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */
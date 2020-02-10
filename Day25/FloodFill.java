/**
 * FloodFill
 */
public class FloodFill {

    public static void main(String[] args) {
        //DFS approach is used
    }
}

class SolutionFloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image[sr][sc] == newColor){
            return image;
        }
        dfsFill(image, sr, sc, image[sr][sc], newColor);

        return image;
    }

    public void dfsFill(int[][] image, int sr, int sc,int prevColor, int newColor){

        if(sr < 0 || sc> 0 || sr> image.length-1 || sc > image[0].length-1){
            return;
        }
        image[sr][sc] = newColor;

        dfsFill(image, sr-1, sc, prevColor, newColor);
        dfsFill(image, sr+1, sc, prevColor, newColor);
        dfsFill(image, sr, sc-1, prevColor, newColor);
        dfsFill(image, sr, sc+1, prevColor, newColor);



        
    }
}
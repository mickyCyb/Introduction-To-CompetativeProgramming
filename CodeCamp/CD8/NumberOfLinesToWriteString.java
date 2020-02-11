/**
 * NumberOfLinesToWriteString
 */
public class NumberOfLinesToWriteString {

    public static void main(String[] args) {
        System.out.println(250%100);
    }


}

class SolutionNumberOfLines {
    public int[] numberOfLines(int[] widths, String S) {
        
        
        int a=0;
        int b=0;
        int arr[] = new int[]{a,b};
        int lines =1;
        int currentWidth=0;
        int maxWidth=100;
        int amount=0;
        int lineMax=100;

        for(int i=0; i<S.length();i++){
            char c = S.charAt(i);

            amount =widths[c -97];

            if(currentWidth + amount <=lineMax){
                currentWidth +=amount;
            }
            else{
                lines++;
                currentWidth = amount;
            }
            
        }
        a=lines;
        b=currentWidth;


        return arr;
    }
}
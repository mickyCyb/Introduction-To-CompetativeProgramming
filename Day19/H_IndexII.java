/**
 * H_IndexII
 */
public class H_IndexII {

    public static void main(String[] args) {
        
    }
}

// H-indexII with logorithmic time can be done by searching for the index with binary search  
class SolutionH_IndexII {
    public int hIndex(int[] citations) {
        
        int frontPointer =0;
        int lastPointer  = citations.length - 1;
        int midPoint;
        int citationLength = citations.length;

        while(frontPointer != lastPointer){

            if(frontPointer == lastPointer){
                midPoint = frontPointer;
            }
            else{
                midPoint = ( (frontPointer + lastPointer))/2;
            }

            if(citationLength - midPoint < citations[midPoint]){
                lastPointer = midPoint - 1;
            }
            else if(citationLength - midPoint> citations[midPoint]){
                frontPointer = midPoint + 1;
            }
            else{
                return citationLength;
            }

        }
        

        return citationLength - frontPointer;
    }
}
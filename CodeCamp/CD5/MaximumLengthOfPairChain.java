import java.util.*;

/**
 * MaximumLengthOfPairChain
 */
public class MaximumLengthOfPairChain {

    public static void main(String[] args) {
        SolutionMaximumLengthOfPairChain maxLen = new SolutionMaximumLengthOfPairChain();

        int ans = maxLen.findLongestChain(new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 } });
        System.out.println(ans);
    }
}

class SolutionMaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {

        int length = 0;
        Arrays.sort(pairs, new TwoDArrayComparator());

        // for (int i = 0; i < pairs.length; i++) {
        //     System.out.println(pairs[i][0] + ", " + pairs[i][1]);
        // }

        //outer loop to iterate from top to bottom of our pair arrays
        for (int i = 0; i < pairs.length; i++) {
            int max = 0;

            // inner loop to iterate from where i is to the top of the array
            for (int j = i - 1; j >= 0; j--) {
                if (pairs[i][0] > pairs[j][1]){
                    max = Math.max(max, pairs[j][0]);
                }
            }
            pairs[i][0] = max + 1;
            length = Math.max(length, max+1);
        }

        return length;
    }
}

// custom comparator function to compare the 0th index of each pair in the array and sort them
    // [[1,2], [2,3], [3,4]]
class TwoDArrayComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        if (o1[0] < o2[0]) {
            return -1;
        } else if (o1[0] > o2[0]) {
            return 1;
        }

        return 0;
    }
}
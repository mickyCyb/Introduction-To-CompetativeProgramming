/**
 * FindTheSmallestDivisorGivenAThreshold
 */
public class FindTheSmallestDivisorGivenAThreshold {

    public static void main(String[] args) {

        SolutionDivisorGivenAThreshold solutionDivisorGivenAThreshold = new SolutionDivisorGivenAThreshold();
        System.out.println(solutionDivisorGivenAThreshold.smallestDivisor(new int[] { 1, 2, 5, 9 }, 6));
    }
}

class SolutionDivisorGivenAThreshold {

    public int smallestDivisor(int[] nums, int threshold) {

        int minNumber = 1; // because the number starts from 1
        int maxNumber = maxOf(nums); // the last number is going to be the maximum of the list
        int divisor = 0;
        int summation;

        while (minNumber <= maxNumber) {

            if (minNumber == maxNumber) {
                divisor = minNumber;
            } else {
                divisor = ((minNumber + maxNumber) - 1) / 2;
            }
            summation = 0;

            System.out.println("min is:" + minNumber);
            System.out.println("max is:" + maxNumber);
            System.out.println("div is:" + divisor);
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % divisor == 0) {
                    summation += nums[i] / divisor;
                } else {
                    summation += (nums[i] / divisor) + 1;
                }
            }
            System.out.println("summation is:" + summation);
            
            if (summation <= threshold) {
                maxNumber = divisor - 1;
            } else{
                minNumber = divisor + 1;
            }

        }

        return minNumber;

    }

    public static int maxOf(int[] arr) {

        int maxNumber = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }

        return maxNumber;
    }

}
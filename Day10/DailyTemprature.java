public class DailyTemprature {
    public static void main(String[] args) {

        SolutionDailyTemp solutionDailyTemp= new SolutionDailyTemp();
       int[] tempArr = solutionDailyTemp.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});

       for(int i=0; i<tempArr.length; i++){
           System.out.print(tempArr[i] + " ");
       }
    }
}

class SolutionDailyTemp {
    public int[] dailyTemperatures(int[] T) {

        //  T = [73, 74, 75, 71, 69, 72, 76, 73]
        //  [1, 4, 2, 1, 1, 0, 0]

        // an array to hold the number of days.
        int [] days = new int[T.length];

        for(int i=0; i<T.length;i++){ // take one element from the array T

            for(int j=i+1; j<T.length; j++){ // and compare it with the rest of the elements in the array
                if(T[i] < T[j]){
                    days[i] = j-i;
                    break;
                }

            }
        }
        return days;
    }
}

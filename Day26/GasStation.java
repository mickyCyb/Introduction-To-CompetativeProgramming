/**
 * GasStation
 */
public class GasStation {

    public static void main(String[] args) {
        
        SolutionGasStation solutionGasStation = new SolutionGasStation();
        int ans = solutionGasStation.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2});
        System.out.println(ans);
    }
}

class SolutionGasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int startIndex =0;
        int tankAmount=0;
        int lostGas=0;

        for(int i=0;i<gas.length;i++){

            tankAmount += gas[i] - cost[i];
            if(tankAmount<0){
                startIndex = i+1;
                lostGas+=tankAmount;
                tankAmount=0;
            }            
        }

        if(tankAmount + lostGas>=0){
            return startIndex;
        }
        
        return -1;
    }
}
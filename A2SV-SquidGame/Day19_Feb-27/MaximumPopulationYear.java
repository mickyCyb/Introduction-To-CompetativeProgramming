
public class MaximumPopulationYear {
    
}
class Solution {
    public int maximumPopulation(int[][] logs) {

        int pop[] = new int[101];
        int max = 0;
        int year = -1;

        for(int i=0; i<logs.length; i++){
            for(int j=logs[i][0]; j<logs[i][1]; j++){
                pop[j-1950]++;
            }
        }
        
        for(int i=0; i<101; i++){
            if(pop[i] > max){
                    max = pop[i];
                    year = i+1950;
                }
        }
        return year;
    }
} 

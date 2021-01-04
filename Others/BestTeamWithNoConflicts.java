class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        
        // use n * 2 matrix array to 
        int[][] team = new int[scores.length][2];
        
        for(int i = 0;i < scores.length; i++){
            team[i][0] = ages[i];
            team[i][1] = scores[i];     
        }
        Arrays.sort(team, (a,b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        
        int [] dp = new int [scores.length];
        dp[0] = team[0][1];
        int res = dp[0];
        for(int i = 0; i < scores.length; i++){
            int max = team[i][1];
            for(int j = 0; j < i; j++){
                if(team[i][1] >= team[j][1]){
                    max = Math.max(max, team[i][1] + dp[j]); 
                }
            }
            dp[i] = max;
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}


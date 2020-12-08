class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int greedFactor=0;
        int candies=0;
        int childrens=0;
        while(greedFactor < g.length && candies < s.length){
            if( g[greedFactor] <= s[candies]){
                
                greedFactor++;
                candies++;
                childrens++;
            }
            else{
                candies++;
            }
        }
        return childrens;
    }
}
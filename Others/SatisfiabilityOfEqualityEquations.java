class Solution {
    public boolean equationsPossible(String[] equations) {
        
        int[] parents = new int[26];
        
        for(int i=0; i < 26; i++){
            parents[i] = i;
        }
        
        for(String equation : equations){
            if(equation.charAt(1) == '='){
                union(equation.charAt(0) - 'a', equation.charAt(3) - 'a', parents);
            }
        }
        
        for(String equation : equations){
            if(equation.charAt(1) == '!'){
                boolean check = find(equation.charAt(0) - 'a', equation.charAt(3) - 'a', parents);
                if(check){
                    return false;
                }
            }
        }
        return true;
    }
    
    public void union (int a, int b, int[]parents){
        int parA = getRoot(a,parents);
        int parB = getRoot(b,parents);
        parents[parA] = parB;
        
    }
    
    public boolean find(int a, int b, int[]parents){
        int x = getRoot(a,parents);
        int y = getRoot(b,parents);
        if(x != y){
            return false;
        }
        return true;
    }
    
    public int getRoot(int x, int[]parents){
        if(x == parents[x]){
           return x;
        }
        return getRoot(parents[x], parents);
    }
    
    
}




// optimized with size
// optimized with compressed graph

class Solution {
    public boolean equationsPossible(String[] equations) {
        
        // some optimization added
        int[] parents = new int[26];
        int[] size = new int[26];
        
        for(int i=0; i < 26; i++){
            parents[i] = i;
            size[i] = 1;
        }
        
        for(String equation : equations){
            if(equation.charAt(1) == '='){
                union(equation.charAt(0) - 'a', equation.charAt(3) - 'a', parents,size);
            }
        }
        for(String equation : equations){
            if(equation.charAt(1) == '!'){
                boolean check = find(equation.charAt(0) - 'a', equation.charAt(3) - 'a', parents);
                if(check){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public boolean find(int a, int b, int[] parents){
        int x = getRoot(a, parents);
        int y = getRoot(b, parents);
        
        return x == y;
    }
    
    public void union(int a, int b, int[] parents,int[] size){
        int parA = getRoot(a, parents);
        int parB = getRoot(b, parents);
        
        if(size[parA] < size[parB]){
            parents[parA] = parB;
            size[parB] += size[parA];
        }
        else{
            parents[parB] = parA;
            size[parA] += size[parB];
        }
        
        
    }
     
    public int getRoot(int a, int[] parents){
        if(a == parents[a]){
            return a;
        }
        parents[a] = getRoot(parents[a], parents);
        return parents[a];
    }
}
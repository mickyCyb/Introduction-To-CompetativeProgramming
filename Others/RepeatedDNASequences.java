class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        
        List<String> result = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        
        if(s.length()==0){
            return result;
        }
        
        for(int i=0; i <= s.length()-10; i++){
            String sub = s.substring(i,i+10);
            map.put(sub, map.getOrDefault(sub,0) +1);
            if(map.get(sub) ==2){
                result.add(sub);
            }
            //System.out.println(sub);
        }
        
        return result;
    }
}
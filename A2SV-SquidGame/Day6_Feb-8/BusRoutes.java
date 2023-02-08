import java.util.*;
public class BusRoutes {
    
}
class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        
        HashMap<Integer, ArrayList<Integer>> map = new HashMap();

        for(int i = 0 ; i < routes.length ; i++){
            for(int j = 0; j < routes[i].length ; j++){
                
                int busstop = routes[i][j];
                int bus = i;
                ArrayList<Integer> list = map.getOrDefault(busstop,new ArrayList<Integer>());
                list.add(bus);
                map.put(busstop,list);
                
            }
        }
        
        int level = 0;
        
        HashSet<Integer> busvis = new HashSet<>();
        HashSet<Integer> busstopvis = new HashSet<>();
        
        LinkedList<Integer> queue = new LinkedList();
        queue.addLast(source);
        busstopvis.add(source);
        
        
        while(queue.size() > 0){
            int sz = queue.size();
            
            while(sz-- > 0){
                
                int busstop = queue.removeFirst();
                if(busstop == target){
                    return level;
                }
                
                ArrayList<Integer> buses = map.get(busstop);
                for(int bus : buses){
                    if(busvis.contains(bus)){
                        continue;
                    }
                    
                    int[] arr = routes[bus];
                    for(int busstp : arr){
                        if(busstopvis.contains(busstp)){
                            continue;
                        }
                        
                        queue.addLast(busstp);
                        busstopvis.add(busstp);
                    }
                    
                    busvis.add(bus);
                }
            }
            
            level++;
        }
        
        return -1;
    }
}
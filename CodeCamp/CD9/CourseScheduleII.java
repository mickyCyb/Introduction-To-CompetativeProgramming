/**
 * CourseScheduleII
 */
import java.util.*;
public class CourseScheduleII {

    public static void main(String[] args) {
        SolutionCourseScheduleII scheduleII = new SolutionCourseScheduleII();
        int[] ans = scheduleII.findOrder(4, new int[][]{ {1,0},{2,0},{3,1},{3,2} });

        System.out.print("[");
        for(int i=0; i<ans.length;i++){
            System.out.print(ans[i]);
            if(i==ans.length-1){
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");
    }
}

class SolutionCourseScheduleII {
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();

        for (int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][1];

            if (adjList.containsKey(course)) {
                adjList.get(course).add(prerequisites[i][0]);
            } else {
                List<Integer> nigh = new ArrayList<>();
                nigh.add(prerequisites[i][0]);

                adjList.put(course, nigh);
            }
        }

        int[] check = new int[numCourses];
        int[] result = new int[check.length];
        

        for (int key : adjList.keySet()) {
            List<Integer> nigh = adjList.get(key);

            for (int i : nigh) {
                check[i] += 1;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        int coursesCoverd = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 0) {
                queue.add(i);
                
                coursesCoverd++;
            }
        }
        int k=0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            result[k]=current;
            k++;
            

            if (adjList.containsKey(current)) {
                List<Integer> currList = adjList.get(current);

                for (int nd : currList) {
                    check[nd] -= 1;

                    if (check[nd] == 0) {
                        queue.add(nd);
                        coursesCoverd++;
                    }
                }
            }
        }
        if(coursesCoverd == numCourses){
            return result;
        }
        return new int[]{};
       
        
        
    }
}

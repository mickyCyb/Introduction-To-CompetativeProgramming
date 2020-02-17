/**
 * CourseSchedule
 */
import java.util.*;
public class CourseSchedule {

    public static void main(String[] args) {
        SolutionCourseSchedule solutionCourseSchedule = new SolutionCourseSchedule();
        boolean ans  = solutionCourseSchedule.canFinish(4, new int[][]{ {1,0},{2,0},{3,1},{3,2} });
        System.out.println(ans);
    }
}

class SolutionCourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // hash map to hold the adjacency list
        HashMap<Integer, List<Integer>> adjList = new HashMap<>();

        for(int i=0; i<prerequisites.length; i++){

            int courses = prerequisites[i][1];

            if(adjList.containsKey(courses)){
                adjList.get(courses).add(prerequisites[i][0]);
            }
            else{
                List<Integer> neighbor = new ArrayList<>();
                neighbor.add(prerequisites[i][0]);
                adjList.put(courses, neighbor);
            }
        }

        int[] checkArray = new int[numCourses];

        for(int key : adjList.keySet()){
            List<Integer> outGoingNeighbor = adjList.get(key);
            
            for(int i : outGoingNeighbor){
                checkArray[i]+=1;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        int coursesCovered =0;

        for(int i=0; i<checkArray.length;i++){
            if(checkArray[i]==0){
                queue.add(i);
                coursesCovered++;

            }
        }

        while (!queue.isEmpty()) {
            int currentCourse = queue.poll();

            if(adjList.containsKey(currentCourse)){
                List<Integer> neighbor = adjList.get(currentCourse);
            

                for(int c : neighbor){
                    checkArray[c] -=1;

                    if(checkArray[c] ==0){
                        queue.add(c);
                        coursesCovered++;
                    }
                }
            }
        }


        return coursesCovered == numCourses;
    }
}


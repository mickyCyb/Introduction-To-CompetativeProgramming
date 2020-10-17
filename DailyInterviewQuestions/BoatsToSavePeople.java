public class BoatsToSavePeople{
	public static void main(String[] args) {
		
	}
	
}

class SolutionBoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        if (people.length == 0){
		    return 0;
        }    
        Arrays.sort(people);
        int boats =0;
        int left=0;
        
        // since we need to put 2 people max at one time, its is better to try and do it with
        // the heaviest person with the lightest, if their weight sum is big, we put the heaviest
        // person by himself, and we reapeat this process( sorting is needed for this process)
        
	    int right = people.length - 1;
	    while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
}
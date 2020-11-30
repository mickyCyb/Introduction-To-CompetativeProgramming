	// the bruteforce solution
// class Solution {
//     public int[] corpFlightBookings(int[][] bookings, int n) {
//         int[] result = new int[n];
//         for(int i=0;i<bookings.length;i++){
//            for(int j= bookings[i][0];j<=bookings[i][1];j++){
//                result[j-1] += bookings[i][2];
//            }
 
           
                                   
                
            
//         }
//         return result;
//     }
// }
		//contest
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];
        for(int i=0;i<bookings.length;i++){
            int from = bookings[i][0]-1;
            int to = bookings[i][1];
            int seats = bookings[i][2];
            
            result[from] += seats;
            if(to < n){
                result[to] += -seats;
            }
            
        }
        for(int i=1;i < n;i++){
            result[i] += result[i-1];
        }
        return result;
    }
}
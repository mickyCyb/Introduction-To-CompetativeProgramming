public class ReverseLinkedList {
    public static void main(String[] args) {
    	// main method
    }
}


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  // iterative solution
class SolutionReverseNode {
    public ListNode reverseList(ListNode head) {

        // This is the sample output.
        // Input:  1->2->3->4->5->NULL
        // Output: 5->4->3->2->1->NULL

        ListNode previous = null; //the first element should point to null when reversed back, so it is set to null.
        ListNode nextNode;

        // Check if the initial head isn't null
        if(head!=null) {
            while (head.next != null) { //check the node next to the current one isn't null.
                nextNode = head.next;  // set the next node before cutting the link.
                head.next = previous;
                previous = head;
                head = nextNode;


            }
            // here the head.next points to null so the head should be the element before it.
            head.next = previous;
        }


        return head;
    }
}


// recursive solution
// class Solution {
//     public ListNode reverseList(ListNode head) {
        
//         return reverse(null, head);
//     }
//     public ListNode reverse(ListNode prev, ListNode current){
//         if(current == null){
//             return prev;
//         }
//         ListNode next = current.next;
//         current.next = prev;
        
//         return reverse(current,next);
//     }
// }
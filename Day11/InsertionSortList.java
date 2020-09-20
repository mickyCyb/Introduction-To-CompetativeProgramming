/**
 * InsertionSortList
 */
public class InsertionSortList {

    public static void main(String[] args) {
        
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SolutionInsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        
        ListNode tempNode = new ListNode(0); // a reference so that we can start from the             beginning after each loop ends
        ListNode currentNode = head;
        ListNode prev = tempNode; // prev is used to compare starting from the beginning
        // while there are nodes
        
        while(currentNode != null){
            
            ListNode nextNode = currentNode.next;
            
            // this loops checks for the right position to place the current number
            while(prev.next != null && prev.next.val < currentNode.val){
                prev = prev.next;
            }
            
            currentNode.next = prev.next;
            prev.next = currentNode;
            currentNode = nextNode;
            prev = tempNode;    // always return to initial node
        }
        return tempNode.next;
    }
}
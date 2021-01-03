/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
    
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast  = head.next;
        
        // if the fast pointer catches up to the slow pointer there is a loop
        while(slow != fast){
            
            // if it return null, it means there is an end at the end of nodes(there is no loop)
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        return true;
    }
}
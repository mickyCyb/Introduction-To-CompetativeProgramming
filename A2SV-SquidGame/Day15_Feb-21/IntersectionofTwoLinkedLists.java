
public class IntersectionofTwoLinkedLists {
    
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int distanceA = 0;
        int distanceB = 0;
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        while(tempA != null || tempB != null){
            if(tempA != null){
                distanceA++;
                tempA = tempA.next;
            }
            
            if(tempB != null){
                distanceB++;
                tempB = tempB.next;
            }
        }
        int diff = 0;
        if(distanceA > distanceB){
            diff = distanceA - distanceB;
            for(int i = 0; i < diff; i++){
                headA = headA.next;
            }
        }
        else{
            diff = distanceB - distanceA;
            for(int i = 0; i < diff; i++){
                headB = headB.next;
            }
        }
        
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headB;
    }
}
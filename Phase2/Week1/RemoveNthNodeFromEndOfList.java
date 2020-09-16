public class RemoveNthNodeFromEndOfList{
    public static void main(String[] args) {
        SolutionRemoveNthNodeFromEndOfList sol = new SolutionRemoveNthNodeFromEndOfList();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode ans = sol.removeNthFromEnd(node,2);
        while(ans != null){
            System.out.print(ans.val+" ");
            ans= ans.next;
        }
    }
}


class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
class SolutionRemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len=0;
        ListNode tempNode = head; // nodes to that helps to keep track of the head
        ListNode node = head;
        
        // get how many elements are in the linked list
        while(tempNode != null){
            len++;
            tempNode= tempNode.next;
            
        }
        // get the starting position where we need to start deleting the next node
        // in 1->2->3->4->5, and n = 2.  pos is 3, we call node(3).next.next here
        int pos = len - n ;
        int counter =0;     // counter to check where we are in the linked list
        
        // check if the head is being deleted
        if(pos == 0){
            if(len == 1){   // check of the linked list has only 1 node
                return null;
            }
            ListNode listNode = new ListNode(0);
            listNode.next = head.next;
            return listNode.next;
        }
        // if the linked list has multiple nodes
        while(node != null){
            counter++;
            if(pos == counter){ // we found the position to start deleting next node
                node.next = node.next.next;
            }
            node =node.next;
        }
        return head;
    }
}
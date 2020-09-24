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
public class SortList{
    //
}

class SolutionSortList {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fastNode = head;
        ListNode slowNode = head;
        ListNode tempNode = head;
        
        while(fastNode != null && fastNode.next != null){
            tempNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        tempNode.next = null;
        
        return merge(sortList(head) , sortList(slowNode));
    }
    
    public ListNode merge(ListNode node1, ListNode node2){
        
        // (6ms solution less space efficient)
        
        // if(node1 == null){
        //     return node2;
        // }
        // if(node2 == null){
        //     return node1;
        // }
        // if(node1.val <= node2.val){
        //     node1.next = merge(node1.next,node2);
        //     return node1;
        // }
        // else{
        //     node2.next = merge(node1,node2.next);
        //     return node2;
        // }
        
        // other way of merging  (3 ms solution & space efficient) 
        
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        
        while(node1 != null && node2 != null){
            if(node1.val <= node2.val){
                current.next = node1;
                node1 = node1.next;
            }
            else{
                current.next = node2;
                node2 = node2.next;
            }
            current = current.next;
        }
        if(node1 != null){
            current.next = node1;
            node1 = node1.next;
        }
        if(node2 != null){
            current.next = node2;
            node2 = node2.next;
        }
        
        return temp.next;
        
    }
}
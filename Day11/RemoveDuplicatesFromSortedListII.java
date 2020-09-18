/**
 * RemoveDuplicatesFromSortedListII
 */
public class RemoveDuplicatesFromSortedListII {

    public static void main(String[] args) {
        SolutionRemoveDuplicatesFromSortedListII sol = new SolutionRemoveDuplicatesFromSortedListII();
        ListNode node = new ListNode (1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        ListNode ans = sol.deleteDuplicates(node);

        while(ans!= null){
            System.out.print(ans.val + "->");
            ans = ans.next;
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

class SolutionRemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        // using two pointers (fast and slow)
        ListNode tempNode = new ListNode(0);
        ListNode fastNode = head;
        ListNode slowNode = tempNode;
        slowNode.next = fastNode;
        
        while(fastNode != null){
            while(fastNode.next != null && fastNode.val == fastNode.next.val){
                fastNode= fastNode.next;
            }
            // if there is no duplicate the fast and slow pointers should move equally
            // if found duplicate, skip the duplicates
            if(slowNode.next != fastNode){
                slowNode.next = fastNode.next;
                fastNode = slowNode.next;
            }
            else{// if no duplicate found so far move both pointers forward
                slowNode = slowNode.next;
                fastNode = fastNode.next;
            }
        }
        return tempNode.next;
    }
}
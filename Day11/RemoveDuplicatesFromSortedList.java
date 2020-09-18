/**
 * RemoveDuplicatesFromSortedList
 */
public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        SolutionRemoveDuplicatesFromSortedList sol = new SolutionRemoveDuplicatesFromSortedList();
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
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
 
class SolutionRemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
     
        ListNode currentNode = head;
        
        
        while(currentNode != null && currentNode.next != null){
           
            if(currentNode.val == currentNode.next.val){
                currentNode = currentNode.next.next;
            }
            else{
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}
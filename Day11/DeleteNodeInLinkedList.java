
public class DeleteNodeInLinkedList {
}



/*class ListNodeDelete {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }*/

class SolutionDeleteNode {
    public void deleteNode(ListNode node) {

        if(node!=null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }

    }
}
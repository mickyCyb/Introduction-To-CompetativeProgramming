public class RemoveDuplicatesFromLinkedList {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
         listNode.next = new ListNode(2);
         listNode.next.next = new ListNode(3);
         listNode.next.next.next = new ListNode(3);
         listNode.next.next.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        ListNode h = new SolutionR().deleteDuplicates(listNode);

        System.out.println();
        while (h != null) {
            System.out.print(h.val + ", ");
            h = h.next;
        }
        System.out.println();


    }
}

  class ListNodeDuplicate {
      int val;
      ListNode next;
      ListNodeDuplicate(int x) { val = x; }
  }


class SolutionR {
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null){
            return null;
        }

        ListNode tempHead = head;
        int nodeVal;
        if(head.next !=null){
            nodeVal = tempHead.val;     // get the value of the head
            ListNode nextNode = tempHead.next;       //assign the node next to the head to a new node.

            while (nextNode != null){ //check if the new node doesn't point to null.

                if(nodeVal != nextNode.val){
                    nodeVal = nextNode.val;
                    tempHead.next = nextNode;
                    tempHead =nextNode;

                }
                nextNode =nextNode.next;
            }
            tempHead.next = nextNode;
        }
        return head;
    }
}

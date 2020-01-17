public class MergeTwoSortedLists {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(4);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);

        ListNode printNode = new SolutionMergeTwoSortedLists().mergeTwoLists(listNode, listNode2);

        System.out.println();
        while (printNode != null) {
            System.out.print(printNode.val + ", ");
            printNode = printNode.next;
        }
        System.out.println();


    }
}


class ListNodeMerge {
      int val;
      ListNode next;
      ListNodeMerge(int x) { val = x; }
 }

class SolutionMergeTwoSortedLists {

    //Input: 1->2->4, 1->3->4
    //Output: 1->1->2->3->4->4

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode newNode = new ListNode(0);
        ListNode head = newNode;

        while(l1 != null && l2!=null){
            ListNode currmin;

            if(l1.val > l2.val){
                currmin =l2;
                l2 = l2.next;
            }
            else {
                currmin = l1;
                l1 = l1.next;
            }
            newNode.next = currmin;
            newNode = newNode.next;
        }
        if (l1 != null) {
            newNode.next = l1;
        } else if (l2 != null) {
            newNode.next = l2;
        }


        return head.next;
    }
}
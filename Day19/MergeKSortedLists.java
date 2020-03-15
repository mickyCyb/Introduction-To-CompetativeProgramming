/**
 * MergeKSortedLists
 */
import java.util.*;
public class MergeKSortedLists {

    public static void main(String[] args) {
       
    }
}


class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}


class SolutionMergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(ListNode headNode : lists){
            while(headNode!=null){
                minHeap.add(headNode.val);
                headNode = headNode.next;
            }
        }
        
        ListNode tempHead = new ListNode(0);
        ListNode head = tempHead;
        
        while(!minHeap.isEmpty()){
            head.next= new ListNode(minHeap.remove());
            head= head.next;
        }
        
        return tempHead.next;

    }
}
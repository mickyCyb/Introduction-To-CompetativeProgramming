/**
 * MiddleOfTheLinkedList
 */
public class MiddleOfTheLinkedList {

    public static void main(String[] args) {
        SolutionMiddleOfTheLinkedList sol = new SolutionMiddleOfTheLinkedList();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);

        ListNode ans = sol.middleNode(node);
        while(ans != null){
            System.out.print(ans.val + "->");
            ans= ans.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

// class SolutionMiddleOfTheLinkedList {
//     public ListNode middleNode(ListNode head) { // using counter to know the middle element
        
//         if(head.next ==null){
//             return head;
//         }
        
//         if(head.next.next == null){
//             return head.next;
//         }
        
//         int counter  =0;
        
//         ListNode current = head;
//         while(current!=null){
//             current = current.next;
            
//             counter++;
//         }
//         //System.out.println(counter);
//         int half =0;
//         if(counter %2 ==0){
//             half = (counter/2) + 1;
//         }
//         else{
//             half = (counter/2) +1;
//         }
        
//         ListNode node = head;
//         int count =1;
        
//         while(node!=null){
//             if(count == half){
//                 return node;
//             }
//              node = node.next;
//              count++;
//         }
        
        
//         return node;
//     }
// }

class SolutionMiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) { // using slow and fast node to track the middle element
        
        ListNode slowNode = head;
        ListNode fastNode = head;
        
        while(fastNode != null && fastNode.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }
}
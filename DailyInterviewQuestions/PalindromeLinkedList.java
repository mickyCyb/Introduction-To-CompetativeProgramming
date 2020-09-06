public class PalindromeLinkedList{
    public static void main(String[] args) {
        SolutionPalindromeLinkedList sol = new SolutionPalindromeLinkedList();
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(1);
        System.out.println(sol.isPalindrome(node));
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class SolutionPalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // use two pointers 1 fast and 1 slow and once the fast reaches the end 
        // it goes back to the beginning while the slow pointer remains in the middle
        // we reverse the nodes from the middle to the end using th slow pointer
        // then we check if the values are the same and check for palindrome
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        
        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        fastPointer = head;
        slowPointer = revereHalfNodes(slowPointer);
        
        while(slowPointer != null){
            if(fastPointer.val != slowPointer.val){
                return false;
            }
            slowPointer= slowPointer.next;
            fastPointer= fastPointer.next;
        }
        return true;
    }
    // a function to reverse nodes
    public ListNode revereHalfNodes(ListNode head){
        
        ListNode prevNode = null;
        while(head != null){
            ListNode nextNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = nextNode;
        }
        return prevNode;
    }
}
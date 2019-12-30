public class SwapNodesInPair {
    public static void main(String[] args) {

        SolutionSwapPairs solutionSwapPairs = new SolutionSwapPairs();
        ListNode resultNode = new ListNode(1);
        resultNode.next = new ListNode(2);
        resultNode.next.next = new ListNode(3);
        resultNode.next.next.next = new ListNode(4);

        ListNode output = solutionSwapPairs.swapPairs(resultNode);

        System.out.println();
        while (output != null) {
            System.out.print(output.val + " -> ");
            output = output.next;
        }
        System.out.println("null");


    }
}

class ListNodeSwapPairs {
 int val;
 ListNode next;
 ListNodeSwapPairs(int x) { val = x; }
}
class SolutionSwapPairs {
    public ListNode swapPairs(ListNode head) {

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode currentNode = temp;

        // check if the pair of nodes that are going to get swapped are not null
        while(currentNode.next != null && currentNode.next.next != null){

            // assign the nodes that are going to get swapped to a new node.
            ListNode firstNode = currentNode.next;
            ListNode secondNode = currentNode.next.next;

            firstNode.next = secondNode.next;
            currentNode.next = secondNode;

            currentNode.next.next = firstNode;
            currentNode = currentNode.next.next;

        }

        return temp.next;
    }
}

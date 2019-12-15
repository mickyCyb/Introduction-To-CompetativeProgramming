import java.util.ArrayList;

public class NextGreaterNodeInLinkedList {
    public static void main(String[] args) {

        SolutionNextGreaterNode solutionNextGreaterNode = new SolutionNextGreaterNode();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(7);
        listNode.next.next = new ListNode(5);
        listNode.next.next.next = new ListNode(1);
        listNode.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next = new ListNode(2);
        listNode.next.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next.next = new ListNode(1);

        int [] res = solutionNextGreaterNode.nextLargerNodes(listNode);

        for(int i =0; i<res.length; i++){
            System.out.print(res[i]);
            System.out.print(",");
        }

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class SolutionNextGreaterNode {
    public int[] nextLargerNodes(ListNode head) {

//        Input:  [1,7,5,1,9,2,5,1]
//        Output: [7,9,9,9,0,5,0,0]

        ArrayList<Integer> output = new ArrayList<>();
        if(head == null){
            return null;
        }

        ListNode currentNode = head;
        ListNode nextNode;
        int currentNum;
        boolean greaterNumberFound;     // to track if there is no greater node in the list.

        while(currentNode.next != null){

            nextNode = currentNode.next;
            currentNum = currentNode.val;
            greaterNumberFound = false;

            while (nextNode != null){   // compare one node with the rest while greater node is found

                if(currentNum < nextNode.val){
                    output.add(nextNode.val);
                    greaterNumberFound = true;
                    break;                          // break if larger node is found.
                }
                nextNode = nextNode.next;   // go to next node

            }

            if(!greaterNumberFound){    // no greater node found in the list.
                output.add(0);
            }
            currentNode = currentNode.next; // take another node to compare with the rest of the list

        }
        output.add(0); // the last element has no greater node, so it is 0

        return output.stream().mapToInt(i -> i).toArray();
    }
}

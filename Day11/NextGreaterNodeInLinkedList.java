import java.util.*;

/**
 * NextGreaterNodeInLinkedList
 */
public class NextGreaterNodeInLinkedList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(5);

        SolutionNextGreaterNodeInLinkedList2 sol = new SolutionNextGreaterNodeInLinkedList2();
        int[] ans = sol.nextLargerNodes(listNode);
        System.out.println(Arrays.toString(ans)); 
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// using stack (the stack contains the indexes of the arraylist(linked list));
class SolutionNextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        
        ArrayList<Integer> nodeList= new ArrayList<>();
        
        ListNode currentNode = head;
        while(currentNode != null){
            nodeList.add(currentNode.val);
            currentNode = currentNode.next;
        }
        
        Stack<Integer> stack= new Stack<>();
        int[] result = new int[nodeList.size()];
        
        for(int i=0; i<nodeList.size(); i++ ){
            
            while( !stack.isEmpty() && nodeList.get(stack.peek()) < nodeList.get(i) ){
                result[stack.pop()] = nodeList.get(i);
            }
            stack.push(i);
        }
        
        return result;
    }
}

// using only the listnodes
class SolutionNextGreaterNodeInLinkedList2{
    public int[] nextLargerNodes(ListNode head){
        
        ArrayList<Integer> nodeList = new ArrayList<>();
        ListNode currentNode = head;
        boolean foundGreater = false;
        int nodeValue;
        
        while(currentNode.next != null){
            ListNode temp = currentNode.next;
            nodeValue = currentNode.val;
            foundGreater = false;

            while(temp != null){
                if(nodeValue < temp.val){
                    nodeList.add(temp.val);
                    foundGreater= true;
                    break;
                }
                temp = temp.next;
            }
            if(foundGreater == false){
                nodeList.add(0);
            }

            currentNode = currentNode.next;
        }
        nodeList.add(0);
        return nodeList.stream().mapToInt(i -> i).toArray();
    }
}
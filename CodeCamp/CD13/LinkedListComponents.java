/**
 * LinkedListComponents
 */
import java.util.*;
public class LinkedListComponents {

    public static void main(String[] args) {
        
        SolutionLinkedListComponents solutionLinkedListComponents = new SolutionLinkedListComponents();
        ListNode node = new ListNode(1);
        node.next =new ListNode(2);
        node.next.next = new ListNode(0);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(3);

        int ans = solutionLinkedListComponents.numComponents(node, new int[]{3,4,0,2,1});
        System.out.println(ans);
    }
}


 //Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class SolutionLinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
     
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : G){
            set.add(num);
        }
        
        ListNode node = head;
        int count =0;
        boolean exists = false;
        
        while(node != null){
            
            // check if the value of the node is in the list
            if(set.contains(node.val)){
                
                // check if the value of the node is in the list but the prvious node value doesnt exist in the set 
                if(!exists){
                    exists = true;
                    count++;
                }
            }
            else{
                exists = false;
            }
           
            // the current node becomes the next node
           node = node.next;
        }
        
        return count;  
    }
}
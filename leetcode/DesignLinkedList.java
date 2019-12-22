import java.util.LinkedList;

public class DesignLinkedList {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
       /* linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        System.out.println(linkedList.get(1));            // returns 2
        linkedList.deleteAtIndex(1);  // now the linked list is 1->3
        System.out.println(linkedList.get(1));            // returns 3*/
        linkedList.addAtIndex(0,10);
        linkedList.addAtIndex(0,20);
        linkedList.addAtIndex(1,30);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));


    }
}


class MyLinkedList {

    /** Initialize your data structure here. */
    ListNode head;
    ListNode tail;
    int size;

    public MyLinkedList() {
       // head = tail = null;     // initially the list is empty so, both the head and tail should point to null.
        size=0;                // for empty list the size is zero.
    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index < 0 || head == null || index > size){  // if trying to access unavailable node.
            return -1;
        }
        else if(index == 0){
            return head.val;    // if index is zero it means, the index is at the head.
        }
        else{
            int currentIndex =1;    // cases other than the first index. iterate and find the specified index value.
            ListNode previousNode = head;
            ListNode newNode = previousNode.next;

            while(previousNode.next !=null){
                if(currentIndex ==index){
                    return newNode.val;
                }
                previousNode = newNode;
                newNode = previousNode.next;
                currentIndex++;
            }

        }
        return -1;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        if(head == null){       // if there is no node add at the beginning.
            head = new ListNode(val);
            tail = head;
        }
        else {
            ListNode forHead = new ListNode(val);   // add a new node before the previous node and assign it as head
            forHead.next = head;
            head = forHead;
        }
        size++;
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) { // if it is empty node.
        if(tail==null){
            tail = new ListNode(val);
            head = tail;
        }
        else {
            tail.next = new ListNode(val);
            tail = tail.next;
        }
        size++;

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

        if(index ==0){      // if specified index is 0, add it at the head.
            addAtHead(val);
        }
        else if(index ==size){  // if specified index equal total size, add it at the tail.
            addAtTail(val);
        }
        else{
            int currentIndex = 1;   //because the other case starts from 1 if it isn't the head
            ListNode prevNode = head;
            ListNode currentNode = prevNode.next;

            while (prevNode.next != null) {   //iterate till we find the node with the required index.
                if (currentIndex == index) {
                    ListNode node = new ListNode(val);
                    prevNode.next = node;
                    node.next = currentNode;
                    size++;
                    break;
                }

                prevNode = currentNode;
                currentNode = currentNode.next;
                currentIndex++;
            }
        }

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if (index == 0) {  //delete the head and tail if the index is 0.
            if (size == 1 || (head == null && tail == null)) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
            }
            size--;
        }
        else if (index <= size) { // delete node other than 0, by iterating and replacing where the next pointer points.
            int currentIndex = 1;
            ListNode prevNode = head;
            ListNode newNode = prevNode.next;

            while (prevNode.next != null) {
                if (currentIndex == index) {
                    if (index == (size - 1)) {
                        tail = prevNode;
                        prevNode.next = newNode.next;
                    } else {
                        prevNode.next = newNode.next;
                    }
                    size--;
                    break;
                }

                prevNode = newNode;
                newNode = newNode.next;
                currentIndex++;
            }

        }
    }
}

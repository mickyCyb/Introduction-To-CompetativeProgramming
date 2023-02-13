import java.util.HashMap;

public class AllOoneDataStructure {
    
}
class AllOne {

    private HashMap<String, Node> map;
    private Node dummyHead, dummyTail;

    public AllOne() {
        this.map = new HashMap<>();
        this.dummyHead = new Node("", -1);
        this.dummyTail = new Node("", Integer.MAX_VALUE);
        this.dummyHead.next = this.dummyTail;
        this.dummyTail.prev = this.dummyHead;
    }
    
    public void inc(String key) {
        Node node = map.getOrDefault(key, new Node(key, 0));
        node.val += 1;
        if (node.val == 1) {
            insertNewNode(node);
            map.put(key, node);
        } else {
            moveForward(node);
        }
    }
    
    public void dec(String key) {
        Node node = map.get(key);
        node.val -= 1;
        if (node.val == 0) {
            map.remove(key);
            deleteNode(node);
        } else {
            moveBackward(node);
        }
    }
    
    public String getMaxKey() {
        return this.dummyTail.prev.key;
    }
    
    public String getMinKey() {
        return this.dummyHead.next.key;
    }

    /* private utility methods */
    private void insertNewNode(Node node) {
        Node next = this.dummyHead.next;
        this.dummyHead.next = node;
        next.prev = node;
        node.prev = this.dummyHead;
        node.next = next;
        
    }

    private void deleteNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void moveBackward(Node node) {
        if (node.prev == this.dummyHead) return;

        node.prev.next = node.next;
        node.next.prev = node.prev;

        Node currNode = node.prev;
        while (node.val < currNode.val) {
            currNode = currNode.prev;
        }
        Node nextNode = currNode.next;
        currNode.next = node;
        node.prev = currNode;
        nextNode.prev = node;
        node.next = nextNode;
    }

    private void moveForward(Node node) {
        if (node.next == this.dummyTail) return;

        node.prev.next = node.next;
        node.next.prev = node.prev;

        Node currNode = node.next;
        while (node.val > currNode.val) {
            currNode = currNode.next;
        }
        Node prevNode = currNode.prev;
        prevNode.next = node;
        node.prev = prevNode;
        currNode.prev = node;
        node.next = currNode;
    }

    class Node {
        int val;
        String key;
        Node prev, next;
        Node(String key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */

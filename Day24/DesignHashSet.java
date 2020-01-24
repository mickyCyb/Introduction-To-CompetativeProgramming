/**
 * DesignHashSet
 */
import java.util.Arrays;
public class DesignHashSet {

    public static void main(String[] args) {
        
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);         
        hashSet.add(2);         
        System.out.println( hashSet.contains(1) );    // returns true
        System.out.println( hashSet.contains(3) );    // returns false (not found)
        hashSet.add(2);          
        System.out.println( hashSet.contains(2) );    // returns true
        hashSet.remove(2);          
        System.out.println( hashSet.contains(2) );    // returns false (already removed)
    }
}
class MyHashSet {

    /** Initialize your data structure here. */
    int hashSet[];
    public MyHashSet() {
        hashSet = new int [1000001];
        Arrays.fill(hashSet, -1);
    }
    
    public void add(int key) {
        hashSet[key] = key;
    }
    
    public void remove(int key) {
        hashSet[key] = -1;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(hashSet[key] == key){
            return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
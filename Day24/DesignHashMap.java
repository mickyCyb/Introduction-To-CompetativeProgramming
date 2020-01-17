/**
 * DesignHashMap
 */
import java.util.Arrays;

public class DesignHashMap {

    public static void main(String[] args) {
        
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);          
        hashMap.put(2, 2);         
        System.out.println( hashMap.get(1) );            // returns 1
        System.out.println( hashMap.get(3) );            // returns -1 (not found)
        hashMap.put(2, 1);                               // update the existing value
        System.out.println( hashMap.get(2) );            // returns 1 
        hashMap.remove(2);                              // remove the mapping for 2
        hashMap.get(2);                                 // returns -1 (not found) 
    }
}


class MyHashMap {

    int[] arrayHashMap;
    /** Initialize your data structure here. */
    public MyHashMap() {
        arrayHashMap = new int[1000001];
        Arrays.fill(arrayHashMap,0,1000000,-1);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        arrayHashMap[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        
        return arrayHashMap[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        arrayHashMap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
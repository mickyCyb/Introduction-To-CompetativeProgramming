import java.util.HashSet;

/**
 * InsertDeleteGetRandomO_1_
 */
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;
public class InsertDeleteGetRandomO_1_ {

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
            System.out.println(param_1);
        boolean param_2 = obj.remove(2);
            System.out.println(param_2);
        int param_3 = obj.getRandom();
            System.out.println(param_3);
    }
}

class RandomizedSet {

    /** Initialize your data structure here. */
    ArrayList<Integer> insertionList;
    HashSet<Integer> uniqueSet;
    public RandomizedSet() {
        insertionList = new ArrayList<>();
        uniqueSet = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        
        
        if(!uniqueSet.contains(val)){
            uniqueSet.add(val);
            insertionList.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        // here the number is only removed from the set but not from the list
        if(uniqueSet.contains(val)){
            uniqueSet.remove(val);
            return true;
        }
        
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        int randomNumber = random.nextInt(insertionList.size());
        // try to get random number which is in the list and in the set at the same time.
        while(!uniqueSet.contains(insertionList.get(randomNumber))){
            randomNumber = random.nextInt(insertionList.size());
        }
        return insertionList.get(randomNumber);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
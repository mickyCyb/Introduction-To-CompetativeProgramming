/**
 * TopKFrequentWords
 */
import java.util.*;

public class TopKFrequentWords {

    public static void main(String[] args) {
        
    }
}

class SolutionTopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> map = new HashMap<>();
        //change the default min heap to max heap by adding the comparator class
        PriorityQueue<WordPair> maxHeap = new PriorityQueue<>(new MaxHeapWordComparator());
        List<String> list = new ArrayList<>();

        for(String s : words){
            if(!map.containsKey(s)){
                map.put(s, 1);
            }
            else{
                map.put(s , map.get(s) + 1);
            }
        }

        // get the WordPair componets and add them to the heap
        for(String key: map.keySet()){
            String word = key;
            int count = map.get(key);

            WordPair wordPair = new WordPair(word, count);
            maxHeap.add(wordPair);
        }

        // the top k elements in the heap fulfills the condition of frequent words in the list
        for(int i=0; i< k; i++){
            WordPair pair;
            pair = maxHeap.poll();
            list.add(pair.word);
        }
        
        return list;
    }
}

// this class is for containing both the word and its count 
class WordPair{
    String word;
    int wordCount;

    public WordPair(String word, int wordCount){
        this.word = word;
        this.wordCount = wordCount;
    }
}

class MaxHeapWordComparator implements Comparator<WordPair>{

    @Override
    public int compare(WordPair o1, WordPair o2) {

        // if the word has less characters than the other word
        if(o1.wordCount <o2.wordCount){
            return 1;
        }
        
        // if the word has more characters than the other word
        else if(o1.wordCount > o2.wordCount){
            return -1;
        }

        // if the words have the same length we use their lexographical order to compare them
        else{

            if(o1.word.compareTo(o2.word) < 0){
                return -1;
            }
            else if(o1.word.compareTo(o2.word) > 0){
                return 1;
            }
            return 0;
        }

    }

}
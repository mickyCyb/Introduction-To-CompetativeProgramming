import java.util.*;

/**
 * LongestWordInDictionary
 */
public class LongestWordInDictionary {

    public static void main(String[] args) {
       
        SolutionLongestWordInDictionary longestWordInDictionary = new SolutionLongestWordInDictionary();
        String ans = longestWordInDictionary.longestWord(new String[]{"w","wo","wor","worl", "world"});
        System.out.println(ans);
    }
}

class TrieNode{

    TrieNode[] children = new TrieNode[26];
    boolean isWordComplete = false;

    public TrieNode(TrieNode[] children, boolean isWordComplete){
        this.children = children;
        this.isWordComplete =isWordComplete;
    }
    public TrieNode(){}
}


class SolutionLongestWordInDictionary {
    public String longestWord(String[] words) {
        
        Arrays.sort(words);
        String result ="";
        int maxWordLength=0;
        TrieNode root = new TrieNode();
        int singleWordLength;

        for(String w:words){
            singleWordLength = w.length();
            TrieNode currentNode = root;

            for(int i=0; i<singleWordLength;i++){
                char c = w.charAt(i);

                if(currentNode.children[c - 97] == null && i!=singleWordLength - 1){
                    break;
                }
                if(currentNode.children[c -97] ==null && i==singleWordLength - 1){
                    currentNode.children[c - 97] = new TrieNode();
                }

                if(currentNode.children[c -97] !=null){
                    currentNode = currentNode.children[c -97];
                }

                if(i == singleWordLength -1 && singleWordLength > maxWordLength ){
                    maxWordLength = singleWordLength;
                    result = w;
                }


            }

        }


        return result;
    }
}
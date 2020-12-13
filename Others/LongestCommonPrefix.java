class Solution {
    public String longestCommonPrefix(String[] strs) {
        TrieNode trie = new TrieNode(false);
        
        // construct the trie
        for(String str : strs){
            
            if(str.equals("")){
                return "";
            }
            TrieNode node = trie;
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                TrieNode _node = node.children[ch - 97];
                
                if(_node == null){
                    node.children[ch - 97] = new TrieNode( i == str.length()-1 );
                    _node = node.children[ch - 97];
                }
                if(i == str.length()-1){
                    node.children[ch - 97].isEnd = i == str.length()-1;
                }
                node = _node;
            }
        }
        
        StringBuilder builder = new StringBuilder();
        Queue<TrieNode> queue = new LinkedList<>();
        queue.add(trie);
        
        while(!queue.isEmpty()){
            TrieNode curr = queue.poll();
            
            if(curr == null || curr.isEnd){
                return builder.toString();
            }
            TrieNode _newCurr = null;
            TrieNode[] children = curr.children;
            int count =0;
            int index =0;
            
            for(int i=0; i < 26;i++){
                if(children[i] != null){
                    _newCurr = children[i];
                    count++;
                    index = i;
                }
                if(count > 1){
                    return builder.toString();
                }
            }
            
            if(count == 0){
                return builder.toString();
            }
            
            queue.add(_newCurr);
            builder.append( (char) (index + 97));
            
            
            
        }
        return builder.toString();
    }
}


class TrieNode{
    
    TrieNode[] children;
    boolean isEnd;
    public TrieNode(boolean isEnd){
        this.isEnd = isEnd;
        this.children = new TrieNode[26];
    }
}
class TrieNode{
    boolean isword;
    TrieNode[] child=new TrieNode[26];
    public TrieNode(){}
}

public class WordDictionary {
    
    private TrieNode root;
    
    public WordDictionary(){
        root=new TrieNode();
    }
    
    // Adds a word into the data structure.
    public void addWord(String word) {
        if(!search(word)){
            TrieNode tmp=root;
            for(int i=0; i<word.length(); i++){
                if(tmp.child[word.charAt(i)-'a']==null)
                    tmp.child[word.charAt(i)-'a']=new TrieNode();
                tmp=tmp.child[word.charAt(i)-'a'];
            }
            tmp.isword=true;
        }
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return helper(word, 0, root);
    }
    
    public boolean helper(String word, int index, TrieNode node){
        if(word.length()==index)
            return node.isword;
        if(word.charAt(index)!='.'){
            if(node.child[word.charAt(index)-'a']==null)
                return false;
            else
                return helper(word, index+1, node.child[word.charAt(index)-'a']);
        }
        else{
            boolean res=false;
            for(int i=0; i<26; i++){
                if(node.child[i]!=null)
                    res=res|helper(word,index+1,node.child[i]);
            }
            return res;
        }
    }
    
}

// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");

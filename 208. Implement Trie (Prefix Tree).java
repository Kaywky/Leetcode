class TrieNode {
    // Initialize your data structure here.
    boolean isword;
    TrieNode[] child = new TrieNode[26];
    public TrieNode() {}
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        if(!search(word)){
            int len=word.length();
            TrieNode tmp=root;
            for(int i=0; i<len; i++){
                if(tmp.child[word.charAt(i)-'a']==null)
                    tmp.child[word.charAt(i)-'a']=new TrieNode();
                tmp=tmp.child[word.charAt(i)-'a'];
            }
            tmp.isword=true;
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode tmp=root;
        for(int i=0; i<word.length(); i++){
            if(tmp.child[word.charAt(i)-'a']==null)
                return false;
            else
                tmp=tmp.child[word.charAt(i)-'a'];
        }
        if(!tmp.isword)
            return false;
        return true;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode tmp=root;
        for(int i=0; i<prefix.length(); i++){
            if(tmp.child[prefix.charAt(i)-'a']==null)
                return false;
            else
                tmp=tmp.child[prefix.charAt(i)-'a'];
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");

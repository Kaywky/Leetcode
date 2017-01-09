public class Solution {
    
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
         Set<String> reach = new HashSet<>();
         reach.add(beginWord);
         wordList.add(endWord);
         int res=1;
         
         while(!reach.contains(endWord)){
             Set<String> tmp = new HashSet();
             for(String e:reach){
                 for(int i=0; i<e.length(); i++){
                     char[] ch = e.toCharArray();
                     for(char c='a'; c<'z'; c++){
                         ch[i]=c;
                         String news=new String(ch);
                         if(wordList.contains(news)){
                             tmp.add(news);
                             wordList.remove(news);
                         }
                     }
                 }
             }
            if(tmp.size()==0)
                 return 0;
            reach=tmp;
            res++;
         }
         
         return res;
    }
    
}

//updating: two-end solution

public class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()>t.length())
            return false;
        
        int pre=0;
        for(int i=0; i<s.length(); i++){
            char tmp=s.charAt(i);
            pre=t.indexOf(tmp, pre);
            if(pre<0)
                return false;
            else
                pre++;
        }
        
        return true;
 
    }
}


//follow-up: (refer to discussion forum)


public class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()>t.length())
            return false;
            
        List<Integer>[] dic = new List[26];
        
        for(int i=0; i<t.length(); i++){
            int index=t.charAt(i)-'a';
            if(dic[index]==null){
                dic[index]=new ArrayList<Integer>();
                dic[index].add(i);
            }
            else{
                dic[index].add(i);
            }
        }
        
        int pre=0;
        for(int i=0; i<s.length(); i++){
            int index=s.charAt(i)-'a';
            if(dic[index]==null)
                return false;
            int j=Collections.binarySearch(dic[index], pre);
            if(j<0)
                j=-j-1;
            if(j>=dic[index].size())
                return false;
            pre=dic[index].get(j)+1;
        }
        
        return true;
        
 
    }
}

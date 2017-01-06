public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        List<char[]> ch = new ArrayList<>();
label:  for(String s: strs){
            for(int i=0; i<ch.size(); i++){
                char[] tmp = s.toCharArray();
                Arrays.sort(tmp);
                if(Arrays.equals(tmp, ch.get(i))){
                    list.get(i).add(s);
                    continue label;
                }
            }
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            ch.add(tmp);
            List<String> str = new ArrayList<>();
            str.add(s);
            list.add(str);
        }
        
        return list;
        
    }
}

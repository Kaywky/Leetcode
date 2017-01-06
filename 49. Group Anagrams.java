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

// this method passes 99/100 tests. one failed because time limit exceeded.

//modified version:

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        
        for(String s:strs){
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String tmps=String.valueOf(tmp); // attention: not "tmp.toString()"; but we can use "Arrays.toString(tmp)"
            if(!map.containsKey(tmps))
                map.put(tmps, new ArrayList<String>());
            map.get(tmps).add(s);
        }
        
        for(String e:map.keySet()){
            list.add(map.get(e));
        }
        return list;
    }
}
    

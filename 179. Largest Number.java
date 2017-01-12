public class Solution {
    public String largestNumber(int[] nums) {
        
        int i=0;
        String[] arr=new String[nums.length];
        for(int e:nums)
            arr[i++]=String.valueOf(e);
        
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String s, String t){
                if(s.charAt(0)!=t.charAt(0) || Integer.parseInt(s)==Integer.parseInt(t))
                    return s.charAt(0)-t.charAt(0);
                    
                if(s.length()!=1 && t.length()!=1){
                int j=1;
                while(j<Math.min(s.length(), t.length())){
                    if(s.charAt(j)==t.charAt(j))
                        j++;
                    else
                        break;
                }
                if(j<Math.min(s.length(),t.length()))
                    return compare(s.substring(j, s.length()), t.substring(j,t.length()));
                else
                    return s.length()>t.length()?compare(s.substring(j,s.length()) , t.substring(0,j)):
                                                compare(s.substring(0,j) , t.substring(j,t.length()));
                }
                
                if(s.length()==1)
                    return compare(s, t.substring(1,t.length()));
                if(t.length()==1)
                    return compare(s.substring(1,s.length()), t);
                return compare(s.substring(1,s.length()), t.substring(1,t.length()));
            }
        });
        
        StringBuffer sb=new StringBuffer();
        
        for(String ele:arr)
            sb.insert(0, ele);
        
        int index=sb.length();
        for(int j=0; j<sb.length(); j++){
            if(sb.charAt(j)!='0'){
                index=j;
                break;
            }
        }
        
        sb.delete(0,index);
        
        return sb.length()==0?"0":sb.toString();
        
    }

}

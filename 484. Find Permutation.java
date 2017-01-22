public class Solution {
    public int[] findPermutation(String s) {
        
        int len=s.length();
        int[] res = new int[len+1];
        if(len==0)
            return res;
            
        int i=0;
        int num=1;
        int dis=0;
        while(i<len+1 && num<=len+1){
            if(i==len || s.charAt(i)=='I'){
                res[i]=num;
                int index=i;
                while(dis!=0){
                    i--; num++;
                    res[i]=num;
                    dis--;
                }
                i=index+1;
                num++;
            }
            else{
                dis++;
                i++;
            }
        }
        
        return res;
        
    }
}

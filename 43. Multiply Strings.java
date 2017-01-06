public class Solution {
    public String multiply(String num1, String num2) {
        int count1=0;
        StringBuffer res = new StringBuffer();
        for(int i=num2.length()-1; i>=0; i--){
            int add=0;
            StringBuffer sum = new StringBuffer();
            for(int j=num1.length()-1; j>=0; j--){
                int tmp = Character.getNumericValue(num1.charAt(j))*Character.getNumericValue(num2.charAt(i))+add;
                add=tmp/10;
                tmp=tmp%10;
                sum.insert(0, (char)(tmp+'0'));
            }
            if(add!=0)
                sum.insert(0,(char)(add+'0'));
            while(res.length()<sum.length()+count1){  
                res.insert(0,'0');
            }
            int tmpadd=0;
            for(int m=sum.length()-1; m>=0; m--){
               int tmp = Character.getNumericValue(sum.charAt(m))+Character.getNumericValue(res.charAt(m))+tmpadd;
               tmpadd=tmp/10;
               tmp=tmp%10;
               res.setCharAt(m, (char)(tmp+'0'));
            }
            if(tmpadd!=0)
                res.insert(0, (char)(tmpadd+'0')); 
            count1++;
        }
        while(res.charAt(0)=='0' && res.length()>1)
            res.deleteCharAt(0);
        return res.toString();
    }
}

//a real bad, stupid method

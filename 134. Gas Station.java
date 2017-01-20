public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        if(gas.length==1)
            return gas[0]>=cost[0]?0:-1;
        
        int[] diff = new int[gas.length];
        for(int i=0; i<gas.length; i++){
            diff[i]=gas[i]-cost[i];
        }
        
        int n = gas.length;
        int i=0, j=1;
        int all=diff[0];
        while(i!=j){
            if(all<0){
                i=(i-1<0)?n-1:i-1;
                all=all+diff[i];
                if(i==j)
                    break;
            }
            else{
                all=all+diff[j];
                j=(j+1>=n)?0:j+1;
                if(i==j)
                    break;
            }
        }
        
        return all>=0?i:-1;
    }
}

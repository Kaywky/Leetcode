/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        boolean[] normal = new boolean[n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j)
                    continue;
                if(!normal[i]){
                    normal[i]=!knows(j,i);
                }
                if(!normal[j]){
                    normal[j]=knows(j,i);
                }
            }
        }
        
        for(int i=0; i<n; i++){
            if(!normal[i])
                return i;
        }
        
        return -1;
    }
}

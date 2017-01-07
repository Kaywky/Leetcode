public class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                res[i][j]=helper(A, B, i, j);
            }
        }
        
        return res;
    }
    
    public int helper(int[][] a, int[][] b, int i, int j){
        int len = a[0].length;
        int res=0;
        for(int m=0; m<len; m++){
            if(a[i][m]==0 || b[m][j]==0)
                continue;
            else
                res+=a[i][m]*b[m][j];
        }
        return res;
    }
}

//advanced version:

public class Solution {
    public int[][] multiply(int[][] A, int[][] B) {
        int m=A.length, n=A[0].length, l=B[0].length;
        int[][] res = new int[m][l];
        List[] tmp = new List[m];
        for(int i=0; i<m; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++){
                if(A[i][j]!=0){
                    list.add(j);
                    list.add(A[i][j]);
                }
            }
            tmp[i]=list;
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<tmp[i].size(); j+=2){
                List<Integer> list = tmp[i];
                for(int k=0; k<l; k++){
                    if(B[list.get(j)][k]!=0){
                        res[i][k]+=list.get(j+1)*B[list.get(j)][k];
                    }
                }
            }
        }
        
        return res;
    }
}

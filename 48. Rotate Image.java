public class Solution {
    public void rotate(int[][] matrix) {
        int len=matrix.length;
        int[][] res=new int[len][len];
        for(int j=len-1; j>=0; j--){
            for(int i=0; i<len; i++){
                res[i][j]=matrix[len-j-1][i];
            }
        }
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                matrix[i][j]=res[i][j];
            }
        }
        
        return;
    }
}

//follow-up: in-place 

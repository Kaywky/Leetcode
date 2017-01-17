public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0 || matrix[0].length==0)
            return false;
        int row=matrix.length;
        int col=matrix[0].length;
        if(target<matrix[0][0] || target>matrix[row-1][col-1])
            return false;
        
        int[] value=new int[row];
        int m=0;
        for(int[] e:matrix){
            value[m++]=e[0];
        }
        
        int i = Arrays.binarySearch(value, target);
        if(i>=0){
            return true;
        }
        else{
            i=-i-1-1;
        }


        int j=Arrays.binarySearch(matrix[i], target);
        if(j>=0)
            return true;
        
        return false;
 
    }
}

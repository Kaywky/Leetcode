public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0 || matrix[0].length==0)
            return false;
            
        int row=matrix.length;
        int col=matrix[0].length;
        if(matrix[0][0]>target || matrix[row-1][col-1]<target)
            return false;
            
        int m=0, n=0;
        for(int i=0; i<row; i++){
            if(matrix[i][col-1]==target)
                return true;
            else if(matrix[i][col-1]<target)
                m++;
            else
                break;
        }
        
        for(int i=0; i<row; i++){
            if(matrix[i][0]==target)
                return true;
            else if(matrix[i][0]<target)
                n++;
            else
                break;
        }

        int index=m;
        while(index<n){
            if(Arrays.binarySearch(matrix[index],target)>=0)
                return true;
            else
                index++;
        }
        
        return false;
        
        
    }
}

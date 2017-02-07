public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length==0 || grid[0].length==0)
            return 0;
        int m=grid.length;
        int n=grid[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 && j==0)
                    continue;
                else if(i==0)
                    grid[i][j]=grid[i][j-1]+grid[i][j];
                else if(j==0)
                    grid[i][j]=grid[i-1][j]+grid[i][j];
                else
                    grid[i][j]=Math.min(grid[i-1][j]+grid[i][j], grid[i][j-1]+grid[i][j]);
            }
        }
        
        return grid[m-1][n-1];
 
        // return helper(grid, 0, 0, 0);
    }
    
    // public int helper(int[][] grid, int i, int j, int sum){
    //     int m=grid.length;
    //     int n=grid[0].length;
    //     if(i==m-1 && j==n-1)
    //         return sum+grid[i][j];
    //     if(i==m-1)
    //         return helper(grid, i, j+1, sum+grid[i][j]);
    //     else if(j==n-1)
    //         return helper(grid, i+1, j, sum+grid[i][j]);
    //     else
    //         return Math.min(helper(grid, i+1, j, sum+grid[i][j]), helper(grid, i, j+1, sum+grid[i][j]));
        
    // }
    // the recusive method may exist some problems, making runtime error
}

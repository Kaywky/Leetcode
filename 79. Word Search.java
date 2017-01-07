public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board.length==0 || board[0].length==0)
            return false;
        int m=board.length;
        int n=board[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(new boolean[m][n], board, i, j, word, 1))
                        return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean helper(boolean[][] reach, char[][] board, int i, int j, String word, int index){
        if(index>word.length()-1)
            return true;
        int m=board.length;
        int n=board[0].length;
        reach[i][j]=true;
        if(i-1>=0 && !reach[i-1][j] && board[i-1][j]==word.charAt(index)){
            if(helper(reach, board, i-1, j, word, index+1)) //attention: index+1 and index++ are different
                return true;
        }
        if(i+1<m && !reach[i+1][j] && board[i+1][j]==word.charAt(index)){
            if(helper(reach, board, i+1, j, word, index+1))
                return true;
        }
        if(j-1>=0 && !reach[i][j-1] && board[i][j-1]==word.charAt(index)){
            if(helper(reach, board, i, j-1, word, index+1))
                return true;
        }
        if(j+1<n && !reach[i][j+1] && board[i][j+1]==word.charAt(index)){
            if(helper(reach, board, i, j+1, word, index+1))
                return true;
        }
        reach[i][j]=false; // pay attention: need backtrack
        return false;
        
    }
    
}

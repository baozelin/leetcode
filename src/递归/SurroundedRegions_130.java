package 递归;

public class SurroundedRegions_130 {
	
	/**
	 * 
	 * 从检查四周，做dfs 有o 变 d// x=0, length-1, y=0,y=length-1
	 * 再做循环 d变o，o变x
	 */
	
	
	
	public void solve(char[][] board) {
        if(board == null || board.length == 0 || board[0].length == 0)
            return;
        
        //x = 0
        for(int y = 0; y < board[0].length; y++){        
                if(board[0][y] == 'O')  dfs(board, 0, y);
            }
        
        //x = board.length -1
        for(int y = 0; y < board[0].length; y++){        
                if(board[board.length - 1][y] == 'O')  dfs(board, board.length-1 , y);
            }
        
        //y = 0
        for(int x = 0; x < board.length; x++){        
                if(board[x][0] == 'O')  dfs(board, x, 0);
            }
        
        //y = board[0].length -1
        for(int x = 0; x < board.length; x++){        
                if(board[x][board[0].length -1] == 'O')  dfs(board, x, board[0].length -1);
            }
        
         for(int i = 0; i < board.length; i++){
	            for(int j = 0; j < board[i].length; j++){
	                if(board[i][j] == 'O')
	                    board[i][j] = 'X';
	                
                    if(board[i][j] == 'D')
                        board[i][j] = 'O';
	            }
        
        }
    }
    
    
    private void dfs(char[][] board, int x, int y){
         if (x < 0 || x >= board.length || y < 0 || y >= board[x].length || board[x][y] == 'X' || board[x][y] =='D') {
             return;
        }
        
        if(board[x][y] == 'O')  board[x][y] = 'D';
        dfs(board, x-1, y);
        dfs(board, x+1, y);
        dfs(board, x, y+1);
        dfs(board, x, y-1);
    }  
}

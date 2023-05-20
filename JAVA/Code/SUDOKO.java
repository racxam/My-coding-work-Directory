class Solution {
    public boolean isSafe(char[][] board,int r,int c,int num){
        //col
        for(int i=0;i<board.length;i++){
            if(board[i][c]==(char)(num+'0')){
                return false;
            }
            
        }
        //row
        for(int j=0;j<board.length;j++){
            if(board[r][j]==(char)(num+'0')){
                return false;
            }
            
        }
        //grid
        int sr=3*(r/3);
        int sc= 3*(c/3);
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
               if(board[i][j]==(char)(num+'0')){
                   return false;
               }
            }
        }
        return true;
        
    }
    public boolean sudoko(char[][] board ,r,c){
        if(r=board.length){
            return true;
        }
        int nr=0;
        int nc=0;
        if(c==board.length-1){
            nr=r+1;
            nc=0;
        }
        else{
            nr=r;
            nc=c+1;
        }
        if(board[r][c]!='.'){
            if(sudoko(board,nr,nc)){
               return true; 
            }
        }
        else{
            //to fill
            for(int i=1;i<=9;i++){
                if(isSafe(board,r,c,i)){
                    board[r][c]=(char)(i+'0');
                    if(sudoko(board,nr,nc)){
                        return true;
                    }
                    else{
                        board[r][c]='.';
                    }
                }
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        sudoko(board, 0,0);
        
        
    }
}
class Solution {
    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;
        if(row==1 && word.length()==1){
          
            String val = String.valueOf(board[0]);

            if(val.indexOf(word)>=0){
                return true;
            }
           return false;
        }
        StringBuilder res = new StringBuilder();
        boolean [][]visited = new boolean[row][col];
        for(int i=0; i< row; i++){
            for(int j=0; j<col; j++){
                if (board[i][j] == word.charAt(0)){
                     if(dfs(board, i, j, res, word, visited)){
                        return true;
                     }
                }
            }


           
        }
         return false;
        
    }

    public boolean dfs(char [][] board, int row, int col, StringBuilder res, String target, boolean[][] visited){
        int ROW = board.length;
        int COL = board[0].length;

        if(row >= ROW || col >= COL || col<0 || row <0){
            return false;
        }
        if(res.length() > target.length()){
            return false;
        }
        if(res.toString().equals(target)){
            return true;
        }
        if(visited[row][col] == true){
            return false;
        }

            visited[row][col] =true;
            res.append(board[row][col]);
    
            boolean down = dfs(board, row-1, col, res, target, visited);
            boolean up   =  dfs(board, row +1, col, res, target, visited);
            boolean left = dfs(board, row, col-1, res, target, visited);
            boolean right =dfs(board, row, col+1, res, target, visited);
            
            res.deleteCharAt(res.length()-1);
       
             visited[row][col] = false;

        return down || up || left || right;
    }
}
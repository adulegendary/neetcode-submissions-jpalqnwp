class Solution {
    public boolean exist(char[][] board, String word) {

        int row  = board.length;
        int col = board[0].length;

        // if(row ==1 && word.length()==1){
        //    String check = String.valueOf(board[0]);
          
        //    if(check.indexOf(word) >=0){
            
        //     return true;
        //    }
        //    return false;
        //   // return check.equals(word);
        // }

        // if(row ==1 && word.length()==2){
        //    String check = String.valueOf(board[0]);
         
        //   // return false;
        //    return check.equals(word);
        // }

        boolean [][]visted = new boolean[row][col];
        StringBuilder collector = new StringBuilder();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(word.charAt(0) == board[i][j]){
                    
                    if(dfs(board, visted, i, j, collector, word)){
                        return true;
                    }
                }
            }
        }

        return false;


    }

    public boolean dfs(char[][] board, boolean[][] visted, int row, int col,StringBuilder coll, String word){
         int ROW = board.length;
         int COL = board[0].length;
        if(coll.toString().equals(word)){
            return true;
         }
         if(row >= ROW || col >=COL || col<0 || row <0){
           //System.out.println("here");
            return false;
         }
    
         if(coll.length() > word.length()){
            return false;
         }
  
         if(visted[row][col]== true){
            return false;
         }
     
        visted[row][col] = true;
        coll.append(board[row][col]);

        boolean up = dfs(board, visted,  row+1,  col, coll, word);
        boolean down =dfs(board, visted,  row-1,  col, coll, word);
        boolean right = dfs(board, visted,  row,  col+1, coll, word);
        boolean left = dfs(board, visted,  row,  col-1, coll, word);

        
        coll.deleteCharAt(coll.length()-1); 
        visted[row][col] = false;
        return up || left || right || down;
    


    }
}

    //     int row = board.length;
    //     int col = board[0].length;
    //     if(row==1 && word.length()==1){
          
    //         String val = String.valueOf(board[0]);

    //         if(val.indexOf(word)>=0){
    //             return true;
    //         }
    //        return false;
    //     }
    //     StringBuilder res = new StringBuilder();
    //     boolean [][]visited = new boolean[row][col];
    //     for(int i=0; i< row; i++){
    //         for(int j=0; j<col; j++){
    //             if (board[i][j] == word.charAt(0)){
    //                  if(dfs(board, i, j, res, word, visited)){
    //                     return true;
    //                  }
    //             }
    //         }


           
    //     }
    //      return false;
        
    // }

    // public boolean dfs(char [][] board, int row, int col, StringBuilder res, String target, boolean[][] visited){
    //     int ROW = board.length;
    //     int COL = board[0].length;

    //     if(row >= ROW || col >= COL || col<0 || row <0){
    //         return false;
    //     }
    //     if(res.length() > target.length()){
    //         return false;
    //     }
    //     if(res.toString().equals(target)){
    //         return true;
    //     }
    //     if(visited[row][col] == true){
    //         return false;
    //     }

    //         visited[row][col] =true;
    //         res.append(board[row][col]);
    
    //         boolean down = dfs(board, row-1, col, res, target, visited)
    //          || dfs(board, row +1, col, res, target, visited)
    //          || dfs(board, row, col-1, res, target, visited)
    //          || dfs(board, row, col+1, res, target, visited);
            
    //         res.deleteCharAt(res.length()-1);
       
    //          visited[row][col] = false;

    //     return down ;
    // }

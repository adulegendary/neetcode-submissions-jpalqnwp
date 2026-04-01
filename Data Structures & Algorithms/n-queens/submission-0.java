class Solution {
    List<List<String>> result;
    char [][]board;
    boolean [] col;
    boolean []dig1;
    boolean []dig2;

    public List<List<String>> solveNQueens(int n) {
       result = new ArrayList<>();
       board = new char[n][n];
       col = new boolean[n];
       dig1 = new boolean[2*n-1];
       dig2 = new boolean[2*n-1];
       for(int i =0; i<n; i++){
            Arrays.fill(board[i], '.');
       }

        dfs(n, 0);

        return result;




    }

    public void dfs(int n, int row){
      

       if(row == n){
         result.add(buildString(n));
       }
       
       
       for(int i=0; i<n; i++){
          int d1 = row + i;
          int d2 = row - i + (n-1);
          
          if(col[i] || dig1[d1] || dig2[d2]){ continue ;}
          
          board[row][i] = 'Q';
          col[i] = dig1[d1] = dig2[d2] = true;
          dfs(n, row+1);

          board[row][i] = '.';
          col[i] = dig1[d1] = dig2[d2] = false;

         
       }
       
      
      
    }
    public List<String> buildString(int n){
        List<String> vales = new ArrayList<>();
        for(int i =0; i< n; i++){vales.add(new String(board[i]));}
        return vales;
    }
}

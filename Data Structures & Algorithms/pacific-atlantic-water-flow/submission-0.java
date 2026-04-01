class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        int row = heights.length;
        int col = heights[0].length;
        List<List<Integer>> result = new ArrayList<>();
        
       
        Set<List<Integer>> pacific = new HashSet();
        Set<List<Integer>> atlantic = new HashSet();

        for(int i=0; i< col; i++){
             dfs(heights, pacific, 0, i, heights[0][i]);
             dfs(heights, atlantic, row-1, i, heights[row-1][i]);

        }
        for(int i=0; i< row; i++){
             dfs(heights, pacific, i, 0, heights[i][0]);
             dfs(heights, atlantic, i, col-1, heights[i][col-1]);
        }
       

        for(int i=0; i< row; i++){
            for(int j=0; j<col; j++){
                if(pacific.contains(List.of(i, j)) && atlantic.contains(List.of(i, j))){
                    result.add(List.of(i, j));
                 }
            }
        }

       


        return result;
        
    }

    public void dfs(int [][]heights, Set<List<Integer>>both, int row, int col, int prev){      
       int ROW = heights.length;
       int COLS =  heights[0].length;
      
       if(row >= ROW || col >= COLS){
        return ;
       }
        if( row <0 || col < 0 || both.contains(List.of(row, col))){
         return ;

       }if(heights[row][col]  < prev){
        return ;
       }

       both.add(List.of(row, col));
       dfs(heights, both, row +1, col, heights[row][col]);
       dfs(heights, both, row -1, col, heights[row][col]);
       dfs(heights, both, row, col-1, heights[row][col]);
       dfs(heights, both, row , col+1, heights[row][col]);

        

    }
}
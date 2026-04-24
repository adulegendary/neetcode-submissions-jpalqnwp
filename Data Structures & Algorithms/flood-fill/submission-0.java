
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        Queue<int[]> q = new LinkedList();
        
        int [][]direction = {{1,0}, {0,1}, {-1, 0}, {0,-1}};
        
        q.add(new int[]{sr,sc});
        int ROW = image.length;
        int COL = image[0].length;
        int orginalValue = image[sr][sc];
        boolean [][]visted = new boolean[ROW][COL];
        visted[sr][sc] = true;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0; i<size; i++){
                int [] temp = q.poll();
                image[temp[0]][temp[1]] = color;
                for(int [] dir : direction){
                    int curRow = dir[0] + temp[0];
                    int curCol = dir[1] + temp[1];
                    if(curRow < ROW && curCol < COL && curRow>=0 && curCol >= 0 && 
                    orginalValue == image[curRow][curCol] && !visted[curRow][curCol]){
                          q.add(new int[]{curRow, curCol});
                          visted[curRow][curCol] = true;
                          
                    }
                }
            }
            
        }
        
        return image;
        
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for(int i=0; i<row; i++){
            for(int j=i; j<col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i]; 
                matrix[j][i] = temp;
               // System.out.println(Arrays.toString(matrix[i][j])); 
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        
        for(int i=0; i<row; i++){
            int left =0;
            int right = col-1;
            while(left < right){
             int temp = matrix[i][left];
             matrix[i][left] = matrix[i][right];
             matrix[i][right] = temp;
             left +=1;
             right -=1;
          }

        }
       
       // System.out.println(Arrays.toString(matrix[1]));
    }
}

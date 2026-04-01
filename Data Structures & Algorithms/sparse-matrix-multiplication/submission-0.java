class Solution {
    public int[][] multiply(int[][] mat1, int[][] mat2) {
        int row = mat1.length;
        int col = mat2[0].length;

        int [][] result = new int[row][col];

        int index =0;
       
        for(int i=0; i<row; i++){
            int secondIndex =0;
            for(int j=0; j<col; j++){
                int values =0;
                
               int rowIncre =0;
               int colIncre =0;
                while(rowIncre < mat1[0].length){
                    values += mat1[index][rowIncre] * mat2[colIncre][secondIndex];
                    rowIncre +=1;
                    colIncre +=1;
                }
                secondIndex +=1;
                result[i][j] = values;
            }
            index +=1;
        }


        return result;
    }
}

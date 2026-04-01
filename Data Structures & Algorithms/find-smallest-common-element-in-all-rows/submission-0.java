class Solution {
    public int smallestCommonElement(int[][] mat) {
        

        // [[1,2,3,4,5],

        // [2,4,5,8,10],
        // [3,5,7,9,11],
        // [1,3,5,7,9]]

       
        for(int i=0; i<mat[0].length; i++){
             
             int row =1;
             while(row < mat.length){
                 System.out.println(row + " this is the row getting in");
                if(check(mat[row], mat[0][i])){
                    row +=1;
                }else{
                    break;
                } 
             }
             
             System.out.println(row + " final row");
             System.out.println(mat[0][i] + " this is value");
             if(row == mat.length) return mat[0][i];
            
        }

        return -1;

    }


    public boolean check(int []arr, int target){
            int left =0;
            int right = arr.length-1;
            System.out.println(target +  " this is the target");
            System.out.println(Arrays.toString(arr) +  " this is the target");
            while(left <= right){
                int mid = (left+right)/2;
                if(arr[mid] == target){
                    return true;
                }else if(arr[mid] > target){
                     right = mid-1;
            
                }else{
                    left = mid +1;
                }
            }

            return false;
    }
    
}

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
  
        int []arr = new int[matrix.length * matrix[0].length];
        int index =0;
        for(int i=0; i< matrix.length; i++) {
            for(int j =0; j< matrix[i].length; j++){
                 arr[index] = matrix[i][j];
                 index +=1;
            }
        }

        int left =0; 
        int right = arr.length-1;
         int mid = (left + right)/2;
        while(mid >=0 && mid <= arr.length-1 && left <= right){
             mid = (left + right)/2;
           System.out.println(arr[mid]);
            if(arr[mid] == target) {
                return true;
            }else if(arr[mid] > target){
                right = mid -1; ;
                 //System.out.println(arr[right]);
            }else{
                left = mid +1 ;
            }

        }
    return false;
}
}

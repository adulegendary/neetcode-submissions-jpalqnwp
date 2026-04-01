class Solution {
    public int[] replaceElements(int[] arr) {
        
        // find max vale
        if(arr.length ==0) return new int[]{0};
        
        int index =0;
        for(int i=0; i<arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i+1; j<arr.length; j++){
              max = Math.max(max, arr[j]);
            
            }
            arr[i] = max;
        }
        
        arr[arr.length-1] = -1;
        System.out.println(Arrays.toString(arr));

        return arr;



    }
}
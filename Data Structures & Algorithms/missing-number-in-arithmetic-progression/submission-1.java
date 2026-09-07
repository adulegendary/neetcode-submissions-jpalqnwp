class Solution {
    public int missingNumber(int[] arr) {
        

        int left = Math.min(arr[0],arr[arr.length-1] );
        int right = Math.max(arr[0],arr[arr.length-1]);
      //  Arrays.sort(arr);
       // int diff = arr[1] - arr[0] // 12,14,15

        //  12-15 = -3/3 = -1

        //  [15,13.12]
           
        //    13 == 15 + 1*1

         int difference = (arr[arr.length - 1] - arr[0]) / arr.length;
         
         int starting = arr[0];
         for(int ar: arr){
            if(ar != starting) return starting;
            starting +=difference;
         }
        //  [15,13,12]
        //  15 -1 = 14

         return arr[0];
    }
}

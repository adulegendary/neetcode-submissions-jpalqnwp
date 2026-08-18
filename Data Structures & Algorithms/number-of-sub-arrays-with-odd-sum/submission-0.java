class Solution {
    public int numOfSubarrays(int[] arr) {
        
         /*
           [1, 3, 5]
            total %2 != 0
              count +=map.get(total)
           [1:0, 4:1, 9:2]

           
         
         
         */
         long answer = 0;
         int limit = 1000000007;
         for(int i=0; i<arr.length; i++){
             long total = 0;
             for(int j=i; j<arr.length; j++){
                 total +=(long)arr[j];
                 if(total %2 !=0){
                     answer = (answer + 1L)% limit;
                 }
             }
         }

         return (int)answer;

    }
}
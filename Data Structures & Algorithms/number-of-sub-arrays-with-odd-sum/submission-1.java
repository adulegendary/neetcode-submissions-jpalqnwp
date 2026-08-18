class Solution {
    public int numOfSubarrays(int[] arr) {
        
     
         int answer = 0;
         int limit = 1000000007;
         int odd =0;
         int even = 0;
         long total = 0;
         for(int i=0; i<arr.length; i++){
              total +=(long)arr[i];
              if((int)total %2 !=0){
                    answer = (answer + 1 + even) % limit;
                    odd +=1;
              }else{
                answer = (answer + odd) % limit;
                even +=1;
              }
            }

         return answer;

    }
}
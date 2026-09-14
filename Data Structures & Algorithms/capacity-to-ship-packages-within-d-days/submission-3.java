class Solution {
    public int shipWithinDays(int[] weights, int days) {


        int right = 100000;
        int left =0;
        for(int i : weights){
              left = Math.max(i, left);
        }
             // 10 + 26 /2  == 18
             // right = 17
             // 10+17/2 = 13
             // 10 + 13/ 2 = 11
             // 10 + 10/2 = 10
             // 10 >
        
        int result = Integer.MAX_VALUE;
    
        while(left <= right){
            int capacity = (left + right)/2;
            int current =0;
            int numberOfDays =1;
            for(int i=0; i<weights.length; i++){
                current +=weights[i];

                if(current <= capacity){
                    continue;
                }else{
                   numberOfDays +=1;
                   current = weights[i];
                }
            }
            // System.out.println(numberOfDays + " those days");
            if(numberOfDays <= days){ 
                result = Math.min(capacity, result); //11
                right = capacity -1;
            }
            else{
                 left = capacity +1;
            }
        }

        return result;
        
    }
}
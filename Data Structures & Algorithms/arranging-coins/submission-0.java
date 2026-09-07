class Solution {
    public int arrangeCoins(int n) {

         if(n==1) return 1;


         
        //  4/2 = 2
        //  2/2 = 1

        //  8/2= 4 = 1
        //  4/2 = 2 = 2
        //  2/2 = 1 = 3
        int remainder =1;   // 4-1 = 3
                            // 3- 2 = 1
                            // 1>3
        int count =0;
         while(n > remainder){
            
            n = n - remainder ;
            remainder +=1;
            count +=1;

         }

         return count;
   

    }
}
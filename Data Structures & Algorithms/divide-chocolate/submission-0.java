class Solution {
    public int maximizeSweetness(int[] sweetness, int k) {
 
        int mysweet=Integer.MAX_VALUE;
        if(k +1 == sweetness.length){
            for(int temp : sweetness){
              mysweet = Math.min(temp, mysweet); 
            }

            return mysweet;
        }
        int right = 0;
        for(int t : sweetness){
            right += t;
        }
        int left =1;
        right /=(k+1);

        while(left <= right){
            int mid = (left + right)/2;

            int current=0;
            int chunk =0;
            int temp =0;
            for(int i=0; i<sweetness.length; i++){
                 current += sweetness[i];
                if(current >= mid){
                    mysweet = Math.min(mysweet, current);
                    current =0;
                    chunk +=1;
                }

              
            }

            if(chunk>=k+1){
              left = mid+1;

            }else{
               right = mid - 1;
            }
        }
        




        return left-1;

        
    }
}

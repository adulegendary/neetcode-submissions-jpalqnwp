class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int max = piles[0];
      for (int i = 1; i < piles.length; i++){
           max = Math.max(max,piles[i]);
      }

      int result = max;
      int left = 1;
      int right = max;
      while(left <= right){
            
            int total=0;
             //System.out.println(right - left + 1);
              System.out.println(left + "   I'm left");
               System.out.println(right + "   I'm right");
            int k = (left + right) / 2;
             System.out.println(k + "  first K value"); 
            for(int i = 0; i <piles.length; i++ ){
                  total += (int)Math.ceil((double)piles[i] / k);

            }
            System.out.println(total + "   I'm total");
             System.out.println(k + "I'm k");
            if(total > h){
                left = k+1;
            }else{
                result = k;//Math.min(k, result);
                right =k-1;
            }
      }


    return result;

    }
}

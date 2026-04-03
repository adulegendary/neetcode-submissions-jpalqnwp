class Solution {
    public int mySqrt(int x) {
        

       if(x==0) return 0;
       double first =1;
       double last = x;

      
      
      
      // System.out.println(valid);
      int result =Integer.MIN_VALUE;
      
      while(first <= last){
         double valid = ((double)(first+last)/2);
         double f = Math.round(valid);
         System.out.println(valid);
         System.out.println(f);
         if((int)f*f <= x){
            result = Math.max(result, (int)f);
            first = (int)f +1;
         }else {
              last = (int)f - 1;
         }   
     }

       return result;

    }
}
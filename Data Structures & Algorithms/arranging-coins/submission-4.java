class Solution {
    public int arrangeCoins(int n) {

         if(n==1) return 1;

        long left = 1;
        long right = n;
        long res = 0;
        while(left <= right){
            long mid = left + (right - left) / 2;
            long sum = (mid * (mid + 1)) / 2;
           
            if(sum > n){
                right = mid - 1;
            } else {
                left = mid + 1;
                res = Math.max(res, mid);
            }
        }

         return (int) res;
   

    }
}
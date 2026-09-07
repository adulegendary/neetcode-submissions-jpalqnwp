class Solution {
    public boolean isPerfectSquare(int num) {
        

       // i=1 , i*i<num; i++
        for(int i=1; i*i<=num; i++){
            int sqr = i*i;
            if(sqr == num) return true;
        }

        return false;
    }
}
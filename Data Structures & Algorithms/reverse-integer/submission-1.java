class Solution {
    public int reverse(int x) {
        boolean lower = false;
        if(0 > x){
            lower = true;
        }
        long abs = Math.abs((long)x);
           System.out.println(abs);
        StringBuilder res = new StringBuilder(String.valueOf(abs));
        
        res.reverse();
      
        if(lower){
            long val = Long.valueOf(res.toString());
            val *= -1;

            if(Integer.MIN_VALUE > val){return 0;}
            return (int)val;
        }

        long val = Long.valueOf(res.toString());
        if(Integer.MAX_VALUE < val){return 0;}
        return (int)val;
    }
}

class Solution {
    public boolean isHappy(int n) {
         Set<Integer> store = new HashSet();
         int result =n;
         while(true){
             result = calcu(n);
             System.out.println(result);
             if(result == 1){return true;}
             if(!store.contains(result)){store.add(result);}
             else if(store.contains(result)){return false;}
             n = result;
             
         }
    }

    public int calcu(int n) {
        int total =0;
        while(n != 0){
            total += (n%10) * (n%10);
            n = n/10;
        }

        return total;
    }
}

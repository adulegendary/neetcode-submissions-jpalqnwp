class Solution {
    public int totalFruit(int[] fruits) {
        
        if(fruits.length ==0) return 0;

        Map<Integer, Integer> store = new HashMap<>();
        int left =0;
        int ans =0;
        for(int right =0; right<fruits.length; right++){
            store.put(fruits[right], store.getOrDefault(fruits[right], 0)+1);
            while(store.size() > 2){
                 store.put(fruits[left], store.getOrDefault(fruits[left], 0)-1);
                 if(store.getOrDefault(fruits[left], 0) ==0){
                       store.remove(fruits[left]);
                 }
               
                left +=1;
            }
            System.out.println(store);
            ans = Math.max(ans, right-left+1);
        }

        
        return ans;
    }
}
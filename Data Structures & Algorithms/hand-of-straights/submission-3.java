class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

       if(hand.length%groupSize != 0){return false;}

        int n = hand.length;

        Map<Integer, Integer> store = new HashMap<>();
        for(int i : hand){
            store.put(i, store.getOrDefault(i, 0) +1);
        }
        Arrays.sort(hand);
       
        for(int i=0; i<n; i++){
           int index=0;
           int check = hand[i];
            System.out.println(store);
           if(store.containsKey(hand[i])){
                while(index< groupSize){  // 
                  index+=1;
           
                  if(store.containsKey(check)){
                     store.put(check, store.getOrDefault(check, 0) -1);
                     if(store.get(check) ==0){
                       store.remove(check);
                  }
                check +=1; 
                }else {
                   System.out.println(store);
                   return false;
                }
           }
           if(store.size() ==0){
            return true;
           }
        } 
          
       
        }

        if(store.size() ==0){
            return true;
        }
       




        return false;
        
        
    }
}

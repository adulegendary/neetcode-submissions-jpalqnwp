class FirstUnique {
    Map<Integer, Integer> freq;
    Queue<Integer> q ;

    public FirstUnique(int[] nums) {
        freq = new HashMap<>(); 
        q = new LinkedList<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
            q.add(i);
        }
    }
    
    public int showFirstUnique() {
         System.out.println("first");
         int [] arr = new int[3];
         int index =0;
         for(int val : q){
             if(freq.get(val) ==1 ){
                 return val;
             }
            
             System.out.println(val);
         }
        

         return -1;
    }
    
    public void add(int value) {
        freq.put(value, freq.getOrDefault(value, 0)+1);
        q.add(value);
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */

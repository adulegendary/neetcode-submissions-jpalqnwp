class FreqStack {
    Stack<Integer> store;
   
    Map<Integer, Integer> values;
    PriorityQueue<int[]> pq;
    int index;
    public FreqStack() {
        store =  new Stack<>();
      
        values = new HashMap<>();
        pq    =  new   PriorityQueue<>((a,b) -> { 
          if(a[0] == b[0]){
             return b[1] - a[1];
          }else{
             return b[0] - a[0];
          }
    });


        index =0;
    }
    
    public void push(int val) {
        store.push(val);
        values.put(val, values.getOrDefault(val, 0)+1);
        int count = values.getOrDefault(val,0);
       
        pq.add(new int[]{count, index, val});
        index +=1;
  
       
    }
    
    public int pop() {
        int [] temp = !pq.isEmpty() ? pq.poll(): new int[]{};
        int res= temp[2];
        System.out.println(Arrays.toString(temp));
        List<Integer> temps = new ArrayList<>();
        
        while(!store.isEmpty() && store.peek() != res){
             temps.add(store.pop());
        }
        store.pop();
        for(int i= temps.size()-1; i>=0; i--){
              store.push(temps.get(i));
        }
       
       values.put(res, values.getOrDefault(res,0)-1);
       if(values.getOrDefault(res,0) ==0){
          values.remove(res);
       }
      
        //System.out.println(Arrays.toString(temp) + " After");
        return res;


    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
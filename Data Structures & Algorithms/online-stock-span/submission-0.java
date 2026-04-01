class StockSpanner {
    Stack<Integer> stack ;
  
    public StockSpanner() {
        stack = new Stack();
       
        
    }
    
    public int next(int price) {
        int count =1;
       // store.add(price);
    //    if(stack.isEmpty()){
    //        stack.push(price);
    //        return 1;
    //    }
      List<Integer> store =  new ArrayList<>();
        while(!stack.isEmpty() && stack.peek()<= price){
             count +=1;
             store.add(stack.pop());
        }
        for(int i : store){
             stack.push(i);
        }
        stack.push(price);

        return count;


        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
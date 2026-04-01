class MinStack {
    Stack<Integer> store;
    Stack<Integer> keep_vale;

    public MinStack() {
       store = new Stack<>();
       keep_vale = new Stack<>();
      
    }
    
    public void push(int val) {
        store.push(val);
        
       
         if(keep_vale.empty() || keep_vale.peek() > val){
           keep_vale.push(val);
        }else {
              keep_vale.push( keep_vale.peek());
        }

      
       
    }
    
    public void pop() {
        store.pop();
        keep_vale.pop();
    }
    
    public int top() {
        int value = store.peek();
        return value;
    }
    
    public int getMin() {
   
       
        return keep_vale.peek();
        
    }
}

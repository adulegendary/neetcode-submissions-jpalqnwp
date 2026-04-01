class MyQueue {
    
    List<Integer> res;
    int index;
    public MyQueue() {
        res = new ArrayList<>();
        index =0;
    }
    
    public void push(int x) {
        res.add(x);
    }
    
    public int pop() {
        int val = res.get(index);
        index+=1;
        return val;
    }
    
    public int peek() {
        return res.get(index);
    }
    
    public boolean empty() {
        return res.size()-index==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
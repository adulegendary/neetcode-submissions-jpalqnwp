class MyStack {
    Queue<Integer> q1;
   //  Queue<Integer> q1;
     List<Integer> res;

    public MyStack() {
       res = new ArrayList<>();
    }
    
    public void push(int x) {
        res.add(x);
    }
    
    public int pop() {
        int val = res.get(res.size()-1);
        res.remove(res.size()-1);
        return val;
    }
    
    public int top() {
        return  res.get(res.size()-1);
    }
    
    public boolean empty() {
        return res.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
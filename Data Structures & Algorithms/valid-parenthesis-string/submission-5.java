class Solution {
    public boolean checkValidString(String s) {
       
        if(s.length()==0){return false;}
        if(s.charAt(0)== ')'){return false;}
  
        char close = ')';
        char open  = '(';
        char joker = '*';
        Stack<Integer> stack =  new Stack();
        Stack<Integer> start =  new Stack();
        for(int i=0; i< s.length(); i++){
            System.out.println(stack);
                if(s.charAt(i) == open){stack.push(i);}
                else if(s.charAt(i) == joker){start.push(i);}
                else{
                    if(stack.isEmpty() && start.isEmpty()){return false;}
                    else if(!stack.isEmpty()) {stack.pop();}
                    else if(!start.isEmpty()){start.pop();}  
                }
               
                
                
        }
        
        while(!stack.isEmpty() && !start.isEmpty()){
            int left =  stack.pop();
            int joke= start.pop();
            if(left > joke){return false;}
        }
        return stack.isEmpty();

      
       // return true;
        
    }
}

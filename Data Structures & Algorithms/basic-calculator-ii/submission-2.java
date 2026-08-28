class Solution {
    public int calculate(String s) {
        
        if(s.length() ==0) return 0;

        Stack<Integer> stack  = new Stack<>();
        char sign = '+';
        int num = 0;
       for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch - '0');
            }if(ch == '*' || ch =='/' || ch =='+' || ch =='-' || i == s.length()-1){
                if(sign == '+'){
                    stack.push(num);
                }else if(sign == '-'){
                     stack.push(-num);
                }else if(sign == '*'){
                    
                    stack.push(num*stack.pop());
                }else if(sign == '/'){
                    stack.push(stack.pop()/num);
                }
                sign = ch;
                num = 0;
                  
            }



        
        }
       int result  =0; 
       while(!stack.isEmpty()){
          result +=stack.pop();
       }
    
     
       return result;
    
    }
}
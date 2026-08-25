class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s.length() ==0) return s;

        
        Stack<Pair<Character, Integer>> stack = new Stack<>();
      
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isLetter(ch)){
                 if(stack.isEmpty()){
                     stack.push(new Pair<>(ch, i));
                 }else if(ch == ')' && stack.peek().getKey() == '('){
                     stack.pop();
                 }else{
                     stack.push(new Pair<>(ch, i));
                 }
            }
        }
        // [ ), ), (, (]
       if(stack.isEmpty()) return s;
         System.out.println(stack);
       StringBuilder result = new StringBuilder();
       for(int i=s.length()-1; i>=0; i--){
           char ch =  s.charAt(i);
            if(Character.isLetter(ch)){
                  result.append(ch);
            }else {
                  System.out.println(ch + " this is ch");
                  System.out.println(ch + " this is ch");
                if(!stack.isEmpty() && ch == stack.peek().getKey() && i == stack.peek().getValue()){
                     stack.pop();
                }else{
                     result.append(ch);
                }
            }
       }

       return result.reverse().toString(); 
       
    }
}
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack();

        for(String ch : operations){
            if(!stack.isEmpty() && ch.equals("C")){
                stack.pop();
            }else if(!stack.isEmpty() && ch.equals("+")){
                int first = stack.pop();
                int add = first + stack.peek();
                stack.push(first);
                stack.push(add);
            }else if(!stack.isEmpty() && ch.equals("D")){
             
                stack.push(stack.peek()*2);
            }else{
                int temp = Integer.parseInt(ch);
                stack.push(temp);
            }
        }
       
       int total =0;
       while(!stack.isEmpty()){
        total +=stack.pop();
       }


        return total;

    }
}
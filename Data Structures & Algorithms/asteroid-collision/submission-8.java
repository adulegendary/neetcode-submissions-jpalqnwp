class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        

        // postive means right
        // negative means left
        if(asteroids.length ==0) return new int[]{};
       Stack<Integer> stack = new Stack<>();
       boolean destroyed = false;
       for(int temp : asteroids){
          if(stack.isEmpty()){
             stack.push(temp);
          }
        //   System.out.println(stack.peek());
        //    System.out.println(temp);
          else {
            while(!stack.isEmpty() && (stack.peek() > 0 && temp < 0)){
                if(Math.abs(stack.peek()) < Math.abs(temp)){
                    stack.pop();
        
                }else if(Math.abs(stack.peek()) == Math.abs(temp)) {
                    destroyed = true;
                    stack.pop();
                    break;
                }else{
                     destroyed = true;
                     break;
                }
            }
         
         if(!destroyed){
          stack.push(temp);
          
         }  
         destroyed = false;
        }

    }

       int [] result = new int[stack.size()];
       if(stack.size()==0) return new int[]{};
       int index = stack.size()-1;
       while(!stack.isEmpty()){
          result[index--] = stack.pop();
       }

       return result;



    }
}
class Solution {
    public int evalRPN(String[] tokens) {

       
        Stack <Integer> vales = new Stack<>();
        int result =0;
        for(String ch : tokens){
             
          if(!ch.equals ("+") && !ch.equals ("-") && !ch.equals ("/") && !ch.equals ("*")){
              System.out.println("here");
              vales.push(Integer.parseInt(ch));
               System.out.println(vales);
          }else {
             System.out.println("here 2");
           System.out.println("here 4");
                result =vales.pop();
                if(ch.equals("+")){
                    result += vales.pop();
                }
                else if(ch.equals("/")){
                    result = vales.pop()/result;
                }
                  else if(ch.equals ("*")){
                    result *=vales.pop();
                }
                  else if(ch.equals ("-")){
                    result =  vales.pop()- result;
                }
             vales.push(result);
             }
            
          }

        return vales.pop();
        
    }
}

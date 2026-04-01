class Solution {
    public String simplifyPath(String path) {
        
        StringBuilder result = new StringBuilder();
        Stack<String> stack = new Stack<>();
        String [] arays = path.split("/");
        System.out.println(Arrays.toString(arays));
        System.out.println(arays.length);
      

      
        for(String temp : arays){
           if(temp.length()==0){
              continue;
           }
            if(temp.equals(".")){
              continue;
           }
           if(!stack.isEmpty() && temp.equals("..")){
               stack.pop();
           }else if(!temp.equals("..")){
             stack.push(temp);
            
           }
        }
      if(stack.isEmpty()){
         result.append("/");
         return result.toString();
      }
      List<String> tempResult = new ArrayList<>();
       while(!stack.isEmpty()){
         System.out.println("Did it getting here");
          tempResult.add(stack.pop());
       }
       int index = tempResult.size()-1;
       result.append("/");
        while(index>=0){
          result.append(tempResult.get(index--)).append("/");
       }
       result.deleteCharAt(result.length()-1);
   
       return result.toString();
    }
}
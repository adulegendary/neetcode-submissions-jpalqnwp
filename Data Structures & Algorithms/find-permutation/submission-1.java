class Solution {
    public int[] findPermutation(String s) {
        

        /*
           i < i+1 i>i+1
           1   2   2   1
        */

        int n = s.length() +1;
        int [] arr = new int[n];
        //   d i
        //[1,2,3]
        //[1,2] 
      Stack<Integer> stack  = new Stack<>(); 
      stack.push(1); 
      int index = 0;   
      for(int i=2; i<=n; i++){
            char ch = s.charAt(i-2);
            if(ch == 'D'){
                stack.push(i);
            }else{
                while(!stack.isEmpty()){
                    arr[index++] = stack.pop();
                }
                stack.push(i);
            }
        }

        while(!stack.isEmpty()){
                    arr[index++] = stack.pop();
                }
     
       return arr;     
      }     
    
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

       int n = temperatures.length; 
       int []result = new int[n];
        Arrays.fill(result, 0);
       Stack<Integer> vales = new Stack<>();
       int counter =0;
        for(int i=0; i<n; i++){
            if(vales.empty()){
                vales.push(i);
            }
            while(!vales.empty() && temperatures[vales.peek()]< temperatures[i]){
                result[vales.peek()] = i- vales.peek();
                vales.pop();
            }
            vales.push(i);
            
            
       }
        




       return result; 
        
    }
}
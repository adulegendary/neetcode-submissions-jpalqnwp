class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        if(k == arr.length){
            for(int i : arr) result.add(i);
            return result;
        }
    
        
        int left =0;
        int counter =0;
        int distancet = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int second = Math.abs(arr[i]-x);
            int first = Math.abs(arr[left]-x);   
            counter +=1; 
             if(counter <= k){
                result.add(arr[i]);
                //System.out.println(result);
             }
             else if(second < first ){
                result.remove(0);
                result.add(arr[i]);
                left+=1;
                // System.out.println(result + "the result");
             }
                
        }

        return result;

    }
}
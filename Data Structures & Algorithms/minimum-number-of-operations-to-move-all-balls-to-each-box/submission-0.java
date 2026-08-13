class Solution {
    public int[] minOperations(String boxes) {
        // pref [0, 0,  1,  1,  2,  3]
             
           //   [0  0   1   0    1   1]
           int [] arr = new int[boxes.length()];
           for(int i=0; i<boxes.length(); i++){
              for(int j =0; j< boxes.length();j++ ){
                    int num  = boxes.charAt(j) - '0';
                    //System.out.println(num  + "  this is nums");
                    if(num ==1){
                         arr[i] += Math.abs(i -j) ;
                    }
              }
           }
           System.out.println(Arrays.toString(arr));

           return arr;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
     
       int [] disFromSource = new int[n];
       for(int i=0; i<n; i++){
          disFromSource[i] = Integer.MAX_VALUE;
       }
       disFromSource[src] =0;
       int stopes = k+1;
         System.out.println(Arrays.toString(disFromSource));
        while(stopes >0){
            int[] temp =  disFromSource.clone();
            for(int []price : flights){
                int start = price[0];
                int end = price[1];
                int p = price[2];
                if(disFromSource[start] != Integer.MAX_VALUE && disFromSource[start] + p < temp[end]){
                    temp[end] = disFromSource[start] + p;
                    if(end == 4){
                        System.out.println("We are at four");
                        System.out.println(stopes);

                    }
                }
            }
            // System.out.println(Arrays.toString(disFromSource));
            stopes -=1;
            System.out.println(Arrays.toString(temp));
            disFromSource = Arrays.copyOf(temp, temp.length);
           // System.out.println(Arrays.toString(disFromSource));
            }
        

       // System.out.println(Arrays.toString(disFromSource));
       if(disFromSource[dst] == Integer.MAX_VALUE){return -1;}
       return disFromSource[dst];
         
    }
}

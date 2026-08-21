class Solution {
    public int brightestPosition(int[][] lights) {
        
    
    
    /*
     [-5, -1],  [-1, 3], [0, 6].
      
    [[0,100000000],[1,100000000]]

    [-100000000,-99999999,  100000000, 1000001 ]
      
    */
    int bright = 0;
    int brightest = 0;
    TreeMap<Integer, Integer> store = new TreeMap<>();
    for(int [] temp : lights){
        int ending =temp[0] + temp[1];
        int starting = temp[0] - temp[1];
        store.put(starting, store.getOrDefault(starting,0)+1);
        store.put(ending+1, store.getOrDefault(ending+1,0) -1);
    }
    System.out.println(store);
   
    int curr = 0;
    for(var e : store.entrySet()){
                   
        curr +=e.getValue();
        if(curr > brightest){
            brightest = curr;
            bright = e.getKey();
        }
    
    }
    return bright;
    }
}

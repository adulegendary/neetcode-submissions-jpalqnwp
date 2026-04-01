class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int sumGas =0;
        int costAll =0;
        for(int i=0; i<gas.length; i++){
            sumGas +=gas[i];
            costAll += cost[i];
        }
      
        if(sumGas < costAll){return -1;}
        int start =0;
        for(int i=0; i<gas.length; i++){
            tank = tank + gas[i] - cost[i];
            if(tank<0){
              tank =0;
              start =i+1;
              continue;
            }
            
        }
        return start;

    }

    // public int helper(int index, int [] gas, int [] cost, int tank){
    //     int n = gas.length-1;
    //     int counter = index+1;
    //     while(counter % n != index ){
    //         tank = tank + gas[counter++] - cost[counter++];
    //         if(tank<0){
    //           break ;
    //         }
    //     }

    //     if(tank<0) {return 0;}
    //     return tank;
    // }
}

class Solution {
  public int canCompleteCircuit(int[] gas, int[] cost) {


      int start = 0;
      int tank =0;
      int gastank =0;
      int costank =0;
      for (int i=0; i< gas.length; i++){
          gastank += gas[i];
          costank +=  cost[i]; 
      }

      if(gastank < costank){ return -1;}    
      
      for (int i=0; i< gas.length; i++){
          tank = tank + gas[i] - cost[i];
          if(tank < 0){
            start = i+1;
            tank =0;
          }
      }


      return start ;     

}
}
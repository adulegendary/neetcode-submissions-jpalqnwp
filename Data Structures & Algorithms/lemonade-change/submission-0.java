class Solution {
   public boolean lemonadeChange(int[] bills) {
  

        if(bills[0]>5){
            return false;
        }
        int fives =0;
        int tens =0;
        for(int i=0; i<bills.length; i++){
        
           if(bills[i]==5){
                fives +=1; 
            }else if(bills[i]== 10 && fives !=0){
                tens +=1;
                fives -=1;

            
            }else if(bills[i]==20 && fives >0 && tens >0){
                 fives -=1;
                 tens -=1;  
            }else if(bills[i]==20 && fives >=3){
                fives -=3;
            }else {
                return false;
            }
        }
 
        return true ;

        
    }

}
class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {

        if(triplets.length ==0 && target.length>0){return false;}

        for(int i=0; i<triplets.length; i++){
            int [] temp = triplets[i];
            if(Arrays.equals(temp, target)){return true;}
            if(temp[0] > target[0] || temp[1] > temp[1] || temp[2]>target[2]){
                    continue;
            }
            for(int j=i+1; j<triplets.length; j++){
                int [] tempJ = triplets[j];
                if(tempJ[0] > target[0] || tempJ[1] > target[1] || tempJ[2]>target[2]){
                    continue;
                }
                int first = Math.max(tempJ[0], temp[0]);
                int second = Math.max(tempJ[1], temp[1]);
                int third = Math.max(tempJ[2], temp[2]);
                int [] store = {first,second, third};
                triplets[j] = store;
                if(Arrays.equals(store, target)){return true;}
             }
             
        }



        return false;
        
    }
}

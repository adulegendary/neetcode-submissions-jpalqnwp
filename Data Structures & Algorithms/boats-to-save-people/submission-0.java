class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
     int boats = 0;
     Arrays.sort(people);

     boolean [] crossed  = new boolean[people.length];

     int left =0; 
     int right = people.length-1;
     while(left <= right){
        if (people[left] + people[right] <= limit){
           boats ++;
           left +=1;
           right -=1;
        }else if(people[right] <= limit){
            right -=1;
            boats +=1;
        }else if(people[left] <= limit){
            right -=1;
            boats +=1;
        }
     }





     return boats;
    }
}
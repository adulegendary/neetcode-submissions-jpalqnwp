/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       
        //System.out.println(target);
        long first =1;
        long last = (long)n;
        while(first <= last){
           int mid = (int)((first + last)/2);
           long target = (long)guess(mid);
           if(target == 0){
             return (int)mid;
           }else if(target ==-1){
               last = mid-1;
           }else{
               first = mid+1;
           }
        }

        return -1;
    }
}
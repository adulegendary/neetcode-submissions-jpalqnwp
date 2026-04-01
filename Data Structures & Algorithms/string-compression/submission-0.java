class Solution {
    public int compress(char[] chars) {
        // start with empty string
        // if it one append 
        // otherwise append with it length or freq

        int left =0;
        int right =0;
        StringBuilder result = new StringBuilder();
        while(right < chars.length){
   
            if (chars[left] != chars[right] && right -left >1){
                result.append(chars[left]).append(right -left);
                left = right;
            }if (chars[left] != chars[right] && right -left ==1){
                  result.append(chars[left]);
                  left = right;
            }
            right +=1;
        }
        if(right - left > 1){
            result.append(chars[left]).append(right -left);
        }else {
            result.append(chars[left]);

        }
        
        //
        int far = Math.min(chars.length, result.length());
        
          //chars = new char[far];
             System.out.println(result.toString());
        for(int i=0; i<far; i++){
            chars[i] = result.charAt(i);
        }
        System.out.println(result.toString());
        return result.length();
    }
}
class Solution {
    public void reverseWords(char[] s) {
        
            
       reverse(s, 0, s.length-1);
       int left =0;
        for(int i =0; i<s.length; i++){
             char ch = s[i];
             if(ch == ' '){
                reverse(s,  left, i-1);
                left = i+1;
             }
        }
          reverse(s,  left, s.length-1);

        System.out.println(Arrays.toString(s));
    }

    public void reverse(char []s, int left, int right){
        while(left < right){
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left +=1;
                right -=1;
         }
    }
}

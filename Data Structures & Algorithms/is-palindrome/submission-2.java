class Solution {
    public boolean isPalindrome(String s) {
          int left=0;
          
          StringBuilder store = new StringBuilder();

          for(int i=0; i< s.length(); i++){
             int lef  = (int) Character.toLowerCase(s.charAt(i));
             
             if(lef>=97 && lef<=122){
                 System.out.println(lef);
               store.append(Character.toLowerCase(s.charAt(i)));
             }
              if(lef>=48 && lef<=57){
                 System.out.println(lef);
               store.append(Character.toLowerCase(s.charAt(i)));
             }
          }
          System.out.println(store);
          int right = store.length()-1;
          while(left < right) {
          
            if(store.charAt(left) !=  store.charAt(right)){
                 System.out.println(Character.toLowerCase(store.charAt(left)) +  " left side");
                  System.out.println(Character.toLowerCase(store.charAt(right))+ " right side");
                return false;
             }
            left  +=1;
            right -=1;
            }
          

          return true;
    }
}

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Store = new HashMap<>();
        for(Character ch: s1.toCharArray()){
            s1Store.put(ch, s1Store.getOrDefault(ch,0) +1);
        }
        System.out.println(s1Store);
    
        for(int i=0 ; i< s2.length(); i++){
          Map<Character, Integer> s2Store = new HashMap<>();
          int counter =0;
            System.out.println("reset");
          for(int j=i ; j< s2.length(); j++){
             Character ch = s2.charAt(j);
             s2Store.put(ch, s2Store.getOrDefault(ch,0) +1);
             if(s2Store.containsKey(ch) && s2Store.getOrDefault(ch,0) > s1Store.getOrDefault(ch,0)){
               break;
             }
            if(s2Store.containsKey(ch) && s1Store.containsKey(ch) && s2Store.getOrDefault(ch,0) <= s1Store.getOrDefault(ch,0)){
                  System.out.println(ch);
                     //System.out.println(j);
                  counter +=1;
            }if(counter  == s1.length()){
                   System.out.println(counter);
                 return true;
            }

          }
        

        }

        return false;
    }
}

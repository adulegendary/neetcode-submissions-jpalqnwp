class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length() ){
        return false;
      }
      
      Map<Character, Integer> values = new HashMap<>();
      Map<Character, Integer> values2 = new HashMap<>();
      for(int i=0; i< s.length(); i++){
           values.put(s.charAt(i), values.getOrDefault(s.charAt(i), 0)+1);
           values2.put(t.charAt(i), values2.getOrDefault(t.charAt(i), 0)+1);
      }
System.out.println(values);
System.out.println(values2);
if(values2.containsKey('a')){
     System.out.println("Yes am here " );
}
      for(Character cur: values.keySet()){
          if(!values2.containsKey(cur) ||!values2.get(cur).equals(values.get(cur))){
               System.out.println("This is hte failed one " + cur);
               return false;
          }
            
            
      }
    return true;

    }
}

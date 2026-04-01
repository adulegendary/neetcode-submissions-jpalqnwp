class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<>();

        if(strings.length==0) return result;
        Map<String, List<String>> store = new HashMap<>();

        for(int i=0; i<strings.length; i++){
          
            StringBuilder convert  = new StringBuilder();
            if(strings[i].length()==1){
               store.computeIfAbsent("-1", k-> new ArrayList<>()).add(strings[i]);
            }else {
              for(int j=0; j<strings[i].length()-1; j++){
                int diff = (((int)strings[i].charAt(j) - (int)strings[i].charAt(j+1)) + 26)%26;
        
                
                convert.append(String.valueOf(diff)); 
              }
              
               store.computeIfAbsent(convert.toString(), k-> new ArrayList<>()).add(strings[i]);

            }

            
            
        }

       
       for(List<String>  vale : store.values()){
            result.add((vale));
       }
      System.out.println(store);
        return result;

    }
}

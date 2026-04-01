class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        
        if(s.length() == 0){return result;}
        Map<Character,  Integer> store = new HashMap<>();
        for(int i=0; i<s.length(); i++){
           char val = s.charAt(i);
           store.put(val, i);
        }


        int begin =0;
        int end =0;
        System.out.println(store);
        for(int i=0; i<s.length(); i++){
            char val = s.charAt(i); 
            end  = Math.max(store.get(val), end);
            if(i == end){
                 int window = end - begin + 1;
                 result.add(window);
                 begin = i+1;
            }
            //System.out.println(counter + "  first");
           
           
        }




        return result;

        
    }
}

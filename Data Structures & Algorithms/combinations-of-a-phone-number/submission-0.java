class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){return result;}

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, String> store = new HashMap<>();
        store.put((char) (1 + '0'), "");
        int first =0;
        int last=3;
        for(int i =2; i<9; i++){
            char val = (char) (i + '0');
            store.put(val, alpha.substring(first, last));
            if(i + 1 == 7 ){
              first = last;
              last +=4;
            }else{
              first = last;
              last +=3;
            }
        }
        store.put((char) (9 + '0') , alpha.substring(first));
        StringBuilder temp = new StringBuilder();
        System.out.println(store);

        dfs(result, temp, store, digits,0);      
        return result;
    }

    public void dfs( List<String> result, StringBuilder temp, Map<Character, String> store, String digits, int index ){
          
          if(index == digits.length()){
              result.add(temp.toString());
              return;
          }
          char val = digits.charAt(index);
          String holder = store.get(val);
          for(int i=0; i<holder.length(); i++){
            char letter = holder.charAt(i);
    
            temp.append(letter);

            dfs(result, temp, store, digits,index+1);   

            temp.deleteCharAt(temp.length()-1); 
          }
    }
}

class Solution {
     List<String> result;
    public List<String> restoreIpAddresses(String s) {


        result = new ArrayList<>();
        dfs(s, 0, new ArrayList<>());
        
        return result;

    }

    public void dfs(String s,  int start, List<String> temp){

         if(temp.size() == 4){
            if(start == s.length()){
                 result.add(String.join(".", temp));
            }
            return ;
         }

         for(int length =1; length <=3; length++){
            if(start + length > s.length()){
                continue;
            }
            String part = s.substring(start, start + length);
            if(part.length()>=2 && part.charAt(0) == '0'){
                   continue;
            }
            if(Integer.parseInt(part) <= 255){
                temp.add(part);
                dfs( s,   start + length, temp);
                temp.remove(temp.size()-1);

            }
         }

         return;
    }
}
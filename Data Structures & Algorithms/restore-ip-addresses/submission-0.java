class Solution {
    List<String> result ;
    public List<String> restoreIpAddresses(String s) {
        
       result = new ArrayList<>();
        backtracking(0, s,  new ArrayList<>());

        return result;
    }

    void backtracking(int index, String s, List<String> temp){

        // if(index > s.length()){
        //     return ;
        // }

        if(temp.size() == 4){
            if(index == s.length()){
                  result.add(String.join(".", temp));
            }
            return;
        }



        for(int length=1; length<=3; length++){
            
            if(index + length > s.length()){
                 break;
            }
            
            String val = s.substring(index, index + length);
            if (val.length() > 1 && val.charAt(0) == '0') {
                 continue; // invalid part
            }
            int convert = Integer.parseInt(val);
            if(convert>=0 && convert<=255){
               temp.add(val);
               backtracking(index + length,  s,  temp);
               temp.remove(temp.size() - 1);
            }
        }

        return;



    }
}
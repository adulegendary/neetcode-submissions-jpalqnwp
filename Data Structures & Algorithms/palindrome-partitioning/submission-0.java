class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        
        dfs(result, s,new ArrayList<>(),0);


        return result;
         
    }
public boolean check(int first, int last, String s){
    while(first < last){
      if(s.charAt(first) == s.charAt(last)){
         first +=1;
         last -=1;
      }else {
        return false;
      }
    }
    return true;
}

public void dfs(List<List<String>> result, String s, List<String> temp, int index){

   if(index == s.length()){
   
     result.add(new ArrayList<>(temp));

     return ;
   }

   for(int i=index; i<s.length(); i++){
     
      if(check(index,i,s)){
        temp.add(s.substring(index, i+1));
        dfs(result,s , temp, i+1);
        temp.remove(temp.size() - 1);
      }

   }


  
}
}

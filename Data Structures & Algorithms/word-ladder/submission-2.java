class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        

        if(beginWord.equals(endWord)) return 0;
        
        int result = 0;
        Queue<String> q = new LinkedList<>();
        
        Set<String> holder  = new HashSet<>();
        Set<String> visted = new HashSet<>();
        for(String val : wordList) holder.add(val);
        if(!holder.contains(endWord)) return 0;
        q.add(beginWord);

        while(!q.isEmpty()){
            int qSize = q.size();
           

            
            result +=1;

           for(int k=0; k<qSize; k++){

            String orginalVal =  q.poll();
            int size = orginalVal.length();

            for(int i=0; i<size; i++){
                char [] chars = orginalVal.toCharArray();
                for(char val = 'a' ; val <= 'z'; val ++){
                    chars[i] = val;
                    String check = String.valueOf(chars);
                    if(check.equals(endWord)) return result+1;
                    
                    if(holder.contains(check) && !visted.contains(check)){
                        System.out.println(check);
                        q.add(check);
                        visted.add(check);
                    } 
                    
            }
            
            }
            if(q.size() ==0) return 0;
        }
          
        }
   






     return result;


    }
}

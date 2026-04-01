class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Set<Character> bord = new HashSet();
       
        
        Map<Integer, Set<Character>> bord = new HashMap<>();

        for(int i =0; i< board.length; i++){ 
            Set<Character> cols = new HashSet();
            for(int j=0; j<board[i].length; j++){
               if((board[j][i] != '.')){
                  if(!cols.contains(board[j][i])){
                     cols.add(board[j][i]);
                 // System.out.println(cols );
                 }else{
                    System.out.println(board[j][i] + " Here 2");
                    return false;
                }  
               } 
            }
        }

        for(int i =0; i< board.length; i++){  
          Set<Character> rows = new HashSet();
          for(int j=0; j<board[i].length; j++){
            if((board[i][j] != '.')){
               if(!rows.contains(board[i][j])){
                  rows.add(board[i][j]);
               }else{
                System.out.println("Here 1");
                return false;
               }   
            }
        }
    }

         for(int i =0; i< board.length; i++){  
            for(int j=0; j<board[i].length; j++){
               int key =  (i/3)*3 + j/3;
               if((board[i][j] != '.')){
                  Set<Character> vales = bord.getOrDefault(key, new HashSet<>());
                   if (vales.contains(board[i][j])) {
                         System.out.println(board[i][j] + " Here 3");
                        return false;
                    }
                   vales.add(board[i][j]);
                   bord.put(key, vales);
               }
            }
         }
         return true;   
        }
}

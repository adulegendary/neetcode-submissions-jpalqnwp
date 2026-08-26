class Solution {
    public String removeDuplicates(String s, int k) {
         

         /*
         
         "deeedbbcccbdaa",
          counter =3
         [a a]
         
         */

         Stack<Pair<Character, Integer>> store = new Stack<>();

         for(char ch : s.toCharArray()){ //[[d,1], [e:1]]
            //  System.out.println(store);
            //  System.out.println(ch);
            if(store.isEmpty()){
                 store.push(new Pair<>(ch, 1));
            }else if(store.peek().getKey() == ch){
                int value = store.peek().getValue() +1;
                if(value ==k){
                     while(value >1){
                        store.pop();
                        value -=1;
                    }
                }else{
                     store.push(new Pair<>(ch, value));
                }
               

            }else{
                 store.push(new Pair<>(ch, 1));
            }
         }

        // System.out.println(store);
         StringBuilder result = new StringBuilder();
         while(!store.isEmpty()){
            Pair<Character, Integer> temp = store.pop();
            result.append(temp.getKey());
            // for(int i=0; i<temp.getValue(); i++){
                  
            // }
         }
         return result.reverse().toString();
    }
}
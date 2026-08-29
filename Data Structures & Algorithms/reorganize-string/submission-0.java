class Solution {

    class Pair{

        private Character ch;
        private int count;

        Pair(Character ch, int count){
           this.count = count;
           this.ch = ch;
        }
        void setCount(int count){
            this.count = count;
        }
        void setCharacter(char ch){
            this.ch = ch;
        }
        int getCount(){
             return this.count;
        }

        char getcharacter (){
             return this.ch;
        }
    
    }
    public String reorganizeString(String s) {
        

    
     Map<Character, Integer> store = new HashMap<>();
     StringBuilder result = new StringBuilder();
     for(char ch : s.toCharArray()){
         store.put(ch, store.getOrDefault(ch, 0) +1);
     }

    PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.getCount(), a.getCount()));

     for(Map.Entry<Character, Integer> e : store.entrySet()){
          pq.add(new Pair(e.getKey(), e.getValue()));
     }

    
    Pair waitLIst = null;
     while(!pq.isEmpty()){
        Pair temp = pq.poll();
        result.append(temp.getcharacter());
        temp.setCount(temp.getCount() - 1);
        if(waitLIst != null){
          pq.add(waitLIst);
        }
        if(temp.getCount() >= 1){ waitLIst = temp; }
        else{
           waitLIst = null;
        }
         //System.out.println(pq.poll());
     }
     if(waitLIst != null) return "";
     
     return result.toString();

  /*
  
      ccccd

      C = 2
    
      CDC
  
   
  
  */ 




     /*
  
      
      
       x = 1
       y = 1 
        a = 1

    yax
      
    
    
       
      
       b = 1
      c =  1
      d = 1
      bcdabcd  

      
     
     
     */


    }
}
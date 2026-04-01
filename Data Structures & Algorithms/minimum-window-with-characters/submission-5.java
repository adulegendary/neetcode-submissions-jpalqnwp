class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tStore = new HashMap<>();
        if(t.length() > s.length()) {
            return "";
        }
        for(Character ch: t.toCharArray()){
            tStore.put(ch, tStore.getOrDefault(ch, 0)+1);
        }
        int left=0;
        int counter =0;
        int minleft = Integer.MAX_VALUE;
        int start =0;
        boolean check =false;
        Map<Character, Integer> sStore = new HashMap<>();
        for(int i=0; i < s.length(); i++){
            Character chs = s.charAt(i);
            
            sStore.put(chs, sStore.getOrDefault(chs, 0)+1);
            if(tStore.containsKey(chs) && sStore.getOrDefault(chs, 0) <= tStore.getOrDefault(chs, 0)){
                counter +=1;
            }
            while(counter == t.length()){
              
                int window = i -left +1;
               // System.out.println(i -left +1 + " second");
                if(window < minleft){
                   minleft = window;
                   start = left;
                   check = true;
                }
               // System.out.println(s.substring(minleft, right + 1));
                Character ch = s.charAt(left);
                sStore.put(ch, sStore.getOrDefault(ch, 0) - 1);
              
                if(tStore.containsKey(ch) && sStore.getOrDefault(ch, 0) < tStore.getOrDefault(ch, 0) ){
                    counter -= 1;
                }
                left +=1;
                
            }

        }
        if(!check){
            return "";
        }
        return s.substring(start,  start + minleft);

    }
}

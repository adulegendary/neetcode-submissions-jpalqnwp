

class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deadLock = new HashSet<>();
        Set<String> visited = new HashSet<>();

        for (String temp : deadends) {
            deadLock.add(temp);
        }

        if (deadLock.contains("0000")) return -1;
        visited.add("0000");

        Queue<String> q = new LinkedList<>();
        q.add("0000");

        int turn = 0;
        while (!q.isEmpty()) {

            int size = q.size();
            turn +=1;
            for (int j = 0; j < size; j++) {
                String cur = q.poll();
                
               
                for (int i = 0; i < 4; i++) {
                    
                    char[] incre = cur.toCharArray();
                    char[] decre = cur.toCharArray();

    // modify incre[i]
                   if (incre[i] == '9') incre[i] = '0';
                   else incre[i]++;

    // modify decre[i]
                   if (decre[i] == '0') decre[i] = '9';
                   else decre[i]--;

                    String increase = new String(incre);
                    String decrease = new String(decre);
                    if (increase.equals(target) || decrease.equals(target)) { return turn; }
                    if (!visited.contains(increase) && !deadLock.contains(increase)){
                        visited.add(increase);
                        q.add(increase);
                    }if(!visited.contains(decrease) && !deadLock.contains(decrease)) {
                         visited.add(decrease);
                         q.add(decrease);
                    }

                   
                }
                
            }
           
        }

        return -1;
    }
}

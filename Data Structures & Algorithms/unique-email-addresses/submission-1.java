class Solution {
    public int numUniqueEmails(String[] emails) {
        Map<String, Set<String>> holder = new HashMap<>();
        int counter =0;
        for(String temp: emails){
            String [] seperate = temp.split("@");
            StringBuilder localName = new StringBuilder();
            for(char ch : seperate[0].toCharArray()){
                 if(ch == '.'){continue;}
                 if(ch == '+'){break ;}
                 else {
                    localName.append(ch);
                 }
            }
           
            if(holder.containsKey(seperate[1])){
                 System.out.println(localName);
                 Set<String> temps = holder.get(seperate[1]);
                if(!temps.contains(localName.toString())){
                   temps.add(localName.toString());
                }
            }else {
                
                 holder.computeIfAbsent(seperate[1], k-> new HashSet<>()).add(localName.toString());
                
            }

        }

 System.out.println(holder);
       for(Map.Entry<String, Set<String>> e : holder.entrySet()){
           counter += e.getValue().size();
       }
        return counter;
    }
}
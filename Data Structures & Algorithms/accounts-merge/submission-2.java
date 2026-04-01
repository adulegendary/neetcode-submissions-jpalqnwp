class Solution {
    Map<String, String> parent;
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> result  = new ArrayList<>();
        Map<String, String>emailToname = new HashMap<>();
        if(accounts.size() ==0) return result;

        for(List<String> temp: accounts){
            String name = temp.get(0);
            for(int i=1; i<temp.size(); i++){
               emailToname.put(temp.get(i), name);
            }
        }
        parent = new HashMap<>();
        for(List<String> temp : accounts){
            String firstEmail = temp.get(1);
            makeItPresent(firstEmail);
            for(int i=2; i<temp.size(); i++){
               makeItPresent(temp.get(i));
               union(firstEmail, temp.get(i));
            }
        }
        Map<String, List<String>> group = new HashMap<>();
        for(String vale : parent.keySet()){
            String root = find(vale);
            group.computeIfAbsent(root, k->new ArrayList<>()).add(vale);
        }

        for(Map.Entry<String, List<String>> e : group.entrySet()){
             List<String> vales = e.getValue();
             String fr = emailToname.get(vales.get(0));
             Collections.sort(vales);
             List<String> merge = new ArrayList<>();
             merge.add(fr);
             merge.addAll(vales);
             result.add(merge);

        }

       return result; 


    }
   
    public void makeItPresent(String email){
        if(!parent.containsKey(email)){
            parent.put(email, email);
        }
    }
   public String find(String email){
        if(!email.equals(parent.get(email))){
            parent.put(email, find(parent.get(email)));
        }
        return parent.get(email);
   }
    public boolean union(String first, String second){
        String root1 = find(first);
        String root2 = find(second);

        if(root1.equals(root2)) return false;

        parent.put(root1, root2);
        return true;
    }
}
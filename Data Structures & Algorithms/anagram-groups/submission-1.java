class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        List<List<String>> result = new ArrayList<>();
        if(strs.length == 0) return result;
      

        Map<String, List<String>> store = new HashMap<>();
        for(String temp : strs){
              char []cha = temp.toCharArray();
              Arrays.sort(cha);
              String ang = String.valueOf(cha);
              System.out.println(ang);
              store.computeIfAbsent(ang, k -> new ArrayList<>()).add(temp);
        }

        for (Map.Entry<String, List<String>> e : store.entrySet()) {
            result.add(e.getValue());
        }

        return result;
    }
}

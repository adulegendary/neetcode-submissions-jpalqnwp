class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> holder = new HashMap<>();
        for(String vales: strs){
            char [] arrs = vales.toCharArray();
            Arrays.sort(arrs);
            String str = new String(arrs);
            if(holder.containsKey(str)){
                holder.get(str).add(vales);
            }else{
                List<String> val = new ArrayList<>();
                val.add(vales);
                holder.put(str, val);
            }
        }

        for(List<String> res: holder.values()){
            result.add(res);
        }
        return result;

    }
}

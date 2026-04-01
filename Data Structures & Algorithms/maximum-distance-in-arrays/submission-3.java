class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        

        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int result = Integer.MIN_VALUE;
        for(int i=1; i<arrays.size(); i++){
            List<Integer> temp = arrays.get(i);
            int n = temp.size()-1;

            int first = Math.abs(temp.get(0) - max);
            int second = Math.abs(temp.get(n)- min);
           
            min = temp.get(0);
            max = temp.get(n);
            result = Math.max(result, Math.max(first, second));
        }



        return result;
    }
}

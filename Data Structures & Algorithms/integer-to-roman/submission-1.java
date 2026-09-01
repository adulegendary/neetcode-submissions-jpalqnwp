class Solution {
    public String intToRoman(int num) {
        

        List<Pair<String, Integer>> store = new ArrayList<>();

        store.add(new Pair<>("I", 1));
        
        store.add(new Pair<>("IV", 4));
        store.add(new Pair<>("V", 5));
        store.add(new Pair<>("IX", 9));
        
        store.add(new Pair<>("X", 10));
        store.add(new Pair<>("XL", 40));  
        store.add(new Pair<>("L", 50));
        
        store.add(new Pair<>("XC", 90));
        store.add(new Pair<>("C", 100));
        store.add(new Pair<>("CD", 400));
        
        store.add(new Pair<>("D", 500));
        store.add(new Pair<>("CM", 900));
        store.add(new Pair<>("M", 1000));


        StringBuilder result = new StringBuilder();

        for(int i= store.size()-1; i>=0; i--){
               Pair<String, Integer> temp = store.get(i);
               int count = num/temp.getValue();
               if( count > 0){
                   result.append(temp.getKey().repeat(count));
                   num = num % temp.getValue();
               }
        }

        return result.toString();
    }
}
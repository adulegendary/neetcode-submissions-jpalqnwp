class WordDistance {
    Map<String, List<Integer>> wordMap; 

    public WordDistance(String[] wordsDict) {
        wordMap = new HashMap<>();
        for(int i=0 ; i<wordsDict.length; i++){
            wordMap.computeIfAbsent(wordsDict[i], k-> new ArrayList<>()).add(i);
        }    
    }
    
    public int shortest(String word1, String word2) {
        int result = 10000000;
        for(int firstOne : wordMap.get(word1)){
             for(int secondOne : wordMap.get(word2)){
                     result = Math.min(result, Math.abs(firstOne - secondOne));
             }
        }

        return result;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(wordsDict);
 * int param_1 = obj.shortest(word1,word2);
 */

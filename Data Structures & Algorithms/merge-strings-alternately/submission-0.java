class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder result = new StringBuilder();
        int left =0;
        int right =0;
        while(left < word1.length() && right < word2.length()){
             result.append(word1.charAt(left));
             result.append(word2.charAt(right));
             left +=1;
             right +=1;

        }

        while(left < word1.length()){
             result.append(word1.charAt(left));
             left +=1;
        }
        while(right < word2.length()){
             result.append(word2.charAt(right));
             right +=1;
        }

        return result.toString();
    }
}
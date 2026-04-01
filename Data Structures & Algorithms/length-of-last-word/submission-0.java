class Solution {
    public int lengthOfLastWord(String s) {
        
        String [] slice = s.split(" ");
        System.out.println(Arrays.toString(slice));

        return slice[slice.length-1].length();
    }
}
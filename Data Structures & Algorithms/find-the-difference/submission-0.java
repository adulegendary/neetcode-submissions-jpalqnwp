class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length()==0 ) return t.charAt(0);
        
        char [] sSort = s.toCharArray();
        char [] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);
        
        int r =0;
        int l =0;
        while(r < sSort.length && l < tSort.length){
            if(sSort[r] == tSort[l]) {
                r +=1;
                l +=1;
            }else {
                return tSort[l];
            }
        }

     return l < tSort.length ? tSort[l] : ' ';

    }
}
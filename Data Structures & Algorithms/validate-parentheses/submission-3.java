class Solution {
    public boolean isValid(String s) {
        Stack<Character> vales = new Stack<>();
        //Map<Character, Character> store = new HashMap<>('{':'}', '[':']', '(':')');
        Map<Character, Character> store = new HashMap<>();
        store.put('}', '{');
        store.put(']', '[');
        store.put(')', '(');
        
        int n = s.length();
        for(int i =0; i<n; i++){
            if(vales.size() ==0) {
                vales.push(s.charAt(i));
            }else if(s.charAt(i)=='(' || s.charAt(i) == '[' || s.charAt(i) =='{'){
                vales.push(s.charAt(i));
            }else{
                if(vales.size()==0) {
                    return false;
                }
                else if(vales.size()>0 && vales.peek() == store.get(s.charAt(i))){
                     vales.pop();
                }else{
                    return false;
                }
            }
        }
        if(vales.size() != 0) {
            return false;
        }
        return true;
    }
}

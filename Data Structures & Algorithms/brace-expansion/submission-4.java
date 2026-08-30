class Solution {
    List<String> result ;
    public String[] expand(String s) {
        
       
       List<List<Character>> options = new ArrayList<>();
       Stack<Character> stack = new Stack();
       List<Character> temp = new ArrayList<>();
       result = new ArrayList<>();
       for (char ch : s.toCharArray()) {

            if (ch == '{') {
                // Characters before { are fixed characters.
                addFixedCharacters(stack, options);
                stack.push(ch);

            } else if (Character.isLetter(ch)) {
                stack.push(ch);

            } else if (ch == '}') {
                List<Character> choices = new ArrayList<>();
                while (stack.peek() != '{') {
                    choices.add(stack.pop());
                }
                stack.pop(); // Remove '{'

                Collections.reverse(choices);
                options.add(choices);
            }

           
        }

       addFixedCharacters(stack, options);
      
       back(options,0, new StringBuilder());
      
       String [] fresult = new String[result.size()];
       int index =0;
       for(String v : result){
           fresult[index++] = v;
       }
        return fresult;
    }


    private void addFixedCharacters( Stack<Character> stack, List<List<Character>> options) {
        
        List<Character> fixedCharacters = new ArrayList<>();
        while (!stack.isEmpty()) {
            fixedCharacters.add(stack.pop());
        }

        Collections.reverse(fixedCharacters);

        // Each fixed letter must be its own position.
        for (char ch : fixedCharacters) {
            List<Character> fixedOption = new ArrayList<>();
            fixedOption.add(ch);
            options.add(fixedOption);
        }
    }

    void back(List<List<Character>> options, int index, StringBuilder val){
           if (index == options.size()) {
        result.add(val.toString());
        return;
    }

    for (int j = 0; j < options.get(index).size(); j++) {
        val.append(options.get(index).get(j));

        back(options, index + 1, val);

        val.deleteCharAt(val.length() - 1);
    }
    return ;

    }
}

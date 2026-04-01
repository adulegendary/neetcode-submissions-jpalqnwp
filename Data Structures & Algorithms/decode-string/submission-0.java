class Solution {
    public String decodeString(String s) {
        

        Stack<Integer> store = new Stack<>();
        Stack<Character> values = new Stack<>();
       
     
       int num =0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }

            else{
                System.out.println(num);
                if(num>0){
                    store.push(num);
                }
                num =0;
                if(ch == '[' || Character.isLetter(ch)){
                    values.push(ch);
                }else if(ch == ']'){
                    StringBuilder temp = new StringBuilder();
                    while(!values.isEmpty() && values.peek() != '['){
                         temp.append(values.pop());
                    }
                    values.pop();
                    temp.reverse();
                
                    int freq = !store.isEmpty()? store.pop(): 0;
                    int size = temp.length();
                    while(freq>1){
                        for(int i=0; i<size; i++){
                            temp.append(temp.charAt(i));
                        }
                        freq -=1;
                    }
                    System.out.println(temp.toString());
                    for(int i=0; i<temp.length(); i++){
                            values.push(temp.charAt(i));
                    }

                    

                }


            }
        }

        StringBuilder result = new StringBuilder();
        while(!values.isEmpty()){
            result.append(values.pop());
        }

        return result.reverse().toString();
    }
}
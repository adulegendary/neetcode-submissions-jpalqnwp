class Solution {

    public String encode(List<String> strs) {
        StringBuilder  vales = new StringBuilder();
        if(strs.size() == 0 ){
            System.out.println(strs.size() + "the lenght of ");
            return "";
        } 
        for(String word : strs) {
            vales.append(word.length());
            vales.append(",");
        }
       // vales.deleteCharAt(vales.length()-1);
        vales.append("!");
        for(String word : strs) {
            vales.append(word);
        }
        return vales.toString();
    }

    public List<String> decode(String str) {

         if(str.length() == 0 ){
            return new ArrayList<>();
        } 
          List<String> decodeVale = new ArrayList<>();
          List<Integer> lengArray = new ArrayList<>();
          int start =0;
          System.out.println(str);
          while(str.charAt(start) != '!'){
            StringBuilder cars = new StringBuilder();
             while(str.charAt(start) != ','){
                  cars.append(str.charAt(start));
                  start += 1; 
                }
                int num = Integer.parseInt(cars.toString());
                lengArray.add(num);
                start += 1;
            }
                
        start += 1;
        System.out.println(lengArray);
        for(Integer leng: lengArray){
            String fin = str.substring(start, start + leng);
            decodeVale.add(fin);
            start +=leng;
        }
          //String last = str.substring(start);
          //decodeVale.add(last);
          return decodeVale;
    }
}

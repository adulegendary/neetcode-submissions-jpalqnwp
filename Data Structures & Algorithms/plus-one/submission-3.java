class Solution {
    public int[] plusOne(int[] digits) {
        
        long total =0;
        for(int n =0; n<digits.length; n++){
            total +=(long)digits[n];
            total *=10;
           
        }
        total /=10;
        total +=1;
        System.out.println(total);
        String sizeLen = Long.toString(total);
        int [] result = new int[sizeLen.length()];
        int index =1;

        
        while(total >0){
            long num = total%10;
            total = total/10;
             System.out.println(num);
            result[result.length-index] = (int)num;
            index +=1; 
        }

       return result;
        
    }
}

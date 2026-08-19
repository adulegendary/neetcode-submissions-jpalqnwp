class Solution {
    public String largestNumber(int[] nums) {
        /*
        [0,2,3,3,4,5,9]
        [3, 30, 34, 5, 9]

        [34, 30, 9, 5, 3]
        3430, 9
        
        [3, 5, 9, 30, 34]
           
        53 + 9 + 3430

        953 30 + 34
        
        
        */

     String[] arr = new String[nums.length];
for (int i = 0; i < nums.length; i++) {
    arr[i] = String.valueOf(nums[i]); // <--- Your code
}
      Arrays.sort(arr, (a, b) -> (b+a).compareTo(a + b));
        System.out.println(Arrays.toString(arr));
        String res = String.join("", arr);
        
        return res.charAt(0) == '0' ? "0": res;
    }
}
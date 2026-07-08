class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int left =0;
        int right =0;
        int [] ans = new int[nums1.length];
        Map<Integer, Integer> store = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            store.put(nums2[i], i);
        }

        while(left < nums1.length){
                int index = store.get(nums1[left]);
                while(index < nums2.length && nums2[index] <= nums1[left]){
                    index +=1;
                }
                ans[left] =  index<nums2.length? nums2[index] : -1 ;
                left +=1;
        }

        return ans;
    }
}
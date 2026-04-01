class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      double result =0;
      int left =0;
      int right=0;
      int index =0;
      int [] arr = new int[nums1.length + nums2.length]; 
       while(left < nums1.length && right< nums2.length){
            if(left < nums1.length && nums1[left] < nums2[right]){
                arr[index] = nums1[left];
                left +=1;
                index +=1;
            }else {
                arr[index] = nums2[right];
                right +=1;
                index +=1;
            }
       
       }
       while(left < nums1.length) {
          arr[index] = nums1[left];
         left +=1;
         index +=1;
       }
       while(right < nums2.length) {
            arr[index] = nums2[right];
            right +=1;
            index +=1;
       }
      int mid =  (nums1.length + nums2.length);
         System.out.println(right);  
       System.out.println(Arrays.toString(arr));
      if(mid%2==0 && mid !=0){
        mid = mid/2;
        result = (double)(arr[mid] + arr[mid-1])/2.0;
        return result;          
      }
        mid = mid/2;
      result= (double)(arr[mid]);
      return result;

    
    
    }
}
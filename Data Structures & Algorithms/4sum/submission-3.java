class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
      List<List<Integer>> result = new ArrayList<>();
      int n = nums.length;
      Arrays.sort(nums);
      System.out.println(Arrays.toString(nums));
      for(int i=0; i< n-3; i++){
       while(i >0 && i<n && nums[i] == nums[i-1]){i++;}
        for(int j = i+1; j<n-2; j++){
            while(j-1 != i && j<n && nums[j] == nums[j-1]){j++;}
            int first =j+1; 
            int last = n-1;
            while(first < last){
                long sum = (long)(nums[i]) + (long)nums[j] + (long)nums[first] + (long)nums[last];
                 System.out.println(sum + "how this happen");
                if(sum > (long)target){ last -=1; }
                else if(sum < (long)target) {first +=1 ;}
                else if(sum == (long)target){
                   // System.out.println(sum + "how this happen");
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[first], nums[last])));
                    last -=1;
                    first +=1;
                    while(first <n && nums[first] == nums[first-1]){first +=1;}
                    while(last >0 && nums[last] == nums[last-1]){last -=1;}
                }
            }

         }
       }
       return result;
      }
    }
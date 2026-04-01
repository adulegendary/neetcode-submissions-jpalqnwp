class Solution {
    public int numSubseq(int[] nums, int target) {
      Arrays.sort(nums);

int MOD = 1_000_000_007;
int res = 0;

int[] power = new int[nums.length];
power[0] = 1;

for (int i = 1; i < nums.length; i++) {
        power[i] = (power[i - 1] * 2) % MOD;
        }

        int l =0; 
        int r = nums.length-1;
 while (l <= r) {
            if (nums[l] + nums[r] <= target) {
                res = (res + power[r - l]) % MOD;
                l++;
            } else {
                r--;
            }
        }

return res;
        
    }
}
class Solution:
    def maximumSumScore(self, nums: List[int]) -> int:
        n = len(nums)
        total = sum(nums)
        pref =0;
        ans =-1000000000
        for i in nums:
            pref +=i
            suff = total - pref + i
            ans = max(ans, pref, suff)
        
        # [5, -4, 2] = 2-5 = -3
        
        return ans
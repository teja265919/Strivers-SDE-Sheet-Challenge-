class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        n  = len(nums)
        l = [0]*(n + 1)
        for i in range(n):
            if(l[nums[i]] == 0):
                l[nums[i]] += 1
            else:
                return nums[i]
        return 0
        

1class Solution:
2    def twoSum(self, nums: List[int], target: int) -> List[int]:
3        p={}
4        for i in range(len(nums)):
5            if target-nums[i] in p.keys():
6                return i,p[target-nums[i]]
7            p[nums[i]]=i
8
9        
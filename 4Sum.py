1class Solution:
2    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
3        nums.sort()
4        res = []
5
6        for i in range(len(nums) - 3):
7            # skip duplicate starting values
8            if i > 0 and nums[i] == nums[i-1]:
9                continue
10            
11            for j in range(i+1, len(nums) - 2):
12                # skip duplicate starting values
13                if j > i + 1 and nums[j] == nums[j-1]:
14                    continue
15                left, right = j + 1, len(nums) - 1
16
17                while left < right:
18                    four_sum = nums[i] + nums[j] + nums[left] + nums[right]
19                    if four_sum == target:
20                        res.append([nums[i], nums[j], nums[left], nums[right]])
21                        left += 1
22                        right -= 1
23
24                        while left < right and nums[left] == nums[left - 1]:
25                            left += 1
26                        while left < right and nums[right] == nums[right + 1]:
27                            right -= 1
28                    elif four_sum < target:
29                        left += 1
30                    else:
31                        right -= 1
32        return res
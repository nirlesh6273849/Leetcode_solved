1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> seen = new HashSet<>();
4        for (int i =0; i< nums.length; i++){
5            if (!seen.add(nums[i])){
6                return true;
7            }
8        }
9        return false;
10    }
11}
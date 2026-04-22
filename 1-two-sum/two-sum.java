class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(target-nums[i],i);
            }
            else return new int[] {i,h.get(nums[i])};
        }
        return new int[]{};
    }
}
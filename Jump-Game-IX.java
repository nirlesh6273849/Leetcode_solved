1class Solution {
2    public int[] maxValue(int[] nums) {
3        int n=nums.length;
4        int[] rightmax=new int[n];
5        int[] leftbig=new int[n];
6        leftbig[0]=nums[0];
7        for(int i=1;i<n;i++){
8            leftbig[i]=Math.max(leftbig[i-1],nums[i]);
9        }
10        rightmax[n-1]=nums[n-1];
11        for(int i=n-2;i>-1;i--){
12            rightmax[i]=Math.min(rightmax[i+1],nums[i]);
13        }
14        int[] res= new int[n];
15        res[n-1]=leftbig[n-1];
16        for(int i=n-2;i>-1;i--){
17            if(leftbig[i]>rightmax[i+1]) res[i]=res[i+1];
18            else res[i]=leftbig[i];
19        }
20        return res;
21    }
22}
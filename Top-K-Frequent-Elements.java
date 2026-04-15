1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        Map<Integer, Integer> freq = new HashMap<>();
4        
5        for (int num : nums) {
6            freq.put(num, freq.getOrDefault(num, 0) + 1);
7        }
8
9        PriorityQueue<Map.Entry<Integer, Integer>> pq =
10            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
11
12        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
13            pq.offer(entry);
14            if (pq.size() > k) pq.poll();
15        }
16
17        int[] ans = new int[k];
18        int index = 0;
19        while (!pq.isEmpty()) {
20            ans[index++] = pq.poll().getKey();
21        }
22
23        return ans;
24    }
25}
26
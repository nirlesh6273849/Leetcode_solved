1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> groups = new HashMap<>();
4        List<List<String>> groupedAnagrams = new ArrayList<>();
5        char[] characters;
6        for(String str: strs){
7            characters = str.toCharArray();
8            Arrays.sort(characters);
9            String sorted = new String(characters);
10            List<String> currentGroup = groups.getOrDefault(sorted, new ArrayList<>());
11            currentGroup.add(str);
12            groups.put(sorted, currentGroup);
13        }
14        return new ArrayList<>(groups.values());
15    }
16}
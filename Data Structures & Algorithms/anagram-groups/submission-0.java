class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }

        List<List<String>> ans = new ArrayList<>();
        for(List<String> list: map.values()) {
            ans.add(list);
        }

        return ans;
    }
}

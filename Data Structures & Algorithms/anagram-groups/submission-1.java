class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList();
        HashMap<String, List<String>> map = new HashMap();

        for(String s: strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String> list = map.getOrDefault(key, new ArrayList());
            list.add(s);
            map.put(key, list);
        }

        for(List<String> list: map.values()){
            groups.add(list);
        }

        return groups;
    }
}

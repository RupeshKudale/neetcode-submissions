class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> set = new HashMap<>();
        int left = 0, right = 0;
        int maxLen = 0;

        while(right < s.length()) {
            char ch = s.charAt(right);

            if(set.containsKey(ch)) {
                left = Math.max(set.get(ch)+1, left);
                set.put(ch, right);
            }

            maxLen = Math.max((right-left+1), maxLen);
            set.put(ch, right);
            right++;
        }
        return maxLen;
    }
}

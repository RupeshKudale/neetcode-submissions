class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;

        for(int right=0; right<s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

            while((right-left+1)-maxFreq > k) {
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0)-1);
                left++;
            }
            maxLen = Math.max(maxLen, (right-left+1));
        }

        return maxLen;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int seq = 0, temp = 1;

        for(int i=1; i<nums.length; i++) {
            if(nums[i-1] == nums[i]) continue;
            if(nums[i] - nums[i-1] == 1) {
                temp++;
            } else {
                seq = Math.max(seq, temp);
                temp = 1;
            }
        }

        return Math.max(seq, temp);
    }
}

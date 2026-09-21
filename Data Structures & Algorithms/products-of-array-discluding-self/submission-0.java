class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            if(i == 0) prefix[i] = nums[i];
            else
                prefix[i] = prefix[i-1] * nums[i];

            int j= (nums.length-1) - i;

            if(j == nums.length-1) suffix[j] = nums[j];
            else {
                suffix[j] = suffix[j+1] * nums[j];
            } 
        }

        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            int prev = i == 0 ? 1 : prefix[i-1];
            int next = i == nums.length-1 ? 1 : suffix[i+1];

            ans[i] = prev*next;
        }

        return ans;
    }
}  

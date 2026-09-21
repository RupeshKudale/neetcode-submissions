class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length-1, target, nums);
    }

    public int binarySearch(int low, int high, int target, int[] nums) {
        if(low>high) {
            return -1;
        }
        int mid = (low+high)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid]>=target) {
            return binarySearch(low, mid-1, target, nums);
        }
        return binarySearch(mid+1, high, target, nums);
    }
}

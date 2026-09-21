class Solution {
    public int maxArea(int[] heights) {
        int maxCapacity = 0;
        int left = 0, right = heights.length-1;

        while(left < right) {
            int capacity = Math.min(heights[left], heights[right]) * (right-left);
            maxCapacity = Math.max(capacity, maxCapacity);

            if(heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        
        return maxCapacity;
    }
}

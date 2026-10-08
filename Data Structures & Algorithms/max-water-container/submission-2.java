class Solution {
    public int maxArea(int[] heights) {
        int max = 0, currentMax = 0;
        int left = 0, right = heights.length - 1;

        while(left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            max = Math.max(area, max);

            if(heights[left] < heights[right]){
                left++;
            } else if(heights[left] > heights[right]){
                right--;
            } else {
                left++;
                right--;
            }
        }

        return max;
    }
}

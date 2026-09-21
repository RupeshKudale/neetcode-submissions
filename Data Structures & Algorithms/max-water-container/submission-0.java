class Solution {
    public int maxArea(int[] heights) {
        int maxCapacity = 0;

        for(int i=0; i<heights.length-1; i++) {
            for(int j=i+1; j<heights.length; j++) {
                int capacity = Math.min(heights[i], heights[j]) * (j-i);
                maxCapacity = Math.max(capacity, maxCapacity);
            }
        }
        
        return maxCapacity;
    }
}

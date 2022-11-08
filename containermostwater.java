class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxarea = 0;
        while(start<end)
        {
            if(height[start]<height[end])
            {
                maxarea = Math.max(maxarea,height[start]*(end-start));
                start++;
            }
            else
            {
                maxarea = Math.max(maxarea,height[end]*(end-start));
                end--;
            }
        }
        return maxarea;
    }
}

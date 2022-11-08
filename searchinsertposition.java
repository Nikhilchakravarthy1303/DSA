class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null)
        {
            return -1;
        }
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        if(target>nums[0] && target<nums[nums.length-1])
        {
            int y = 0;
            while(target>nums[y])
            {
                y++;
            }
            return y;
        }
        if(target<nums[0])
        {
            return 0;
        }
        if(target>nums[nums.length-1])
        {
            return nums.length;
        }
        return -1;
    }
}

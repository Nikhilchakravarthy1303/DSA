class Solution {
    public int ans = 0;
    public void backtrack(int[] nums,int target,int index)
    {
        if(index == nums.length)
        {
            if(target == 0)
            {
                ans++;
                return;
            }
        }
        if(index<nums.length)
        {
             backtrack(nums,target-nums[index],index+1);
             backtrack(nums,target+nums[index],index+1);
        }
    }
    public int findTargetSumWays(int[] nums, int target)
    {
        backtrack(nums,target,0);
        backtrack(nums,target,0);
        return ans/2;
    }
}

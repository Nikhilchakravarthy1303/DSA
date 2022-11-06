import java.util.*;
class Solution {
    public void rec(int index,int[] nums,List<List<Integer>> l,List<Integer> sublist,Set<Integer> maxcash)
    {
        if(index>=nums.length)
        {
            int y = 0;
            for(Integer i:sublist)
            {
                y += i;
            }
            maxcash.add(y);
            return;
        }
        sublist.add(nums[index]);
        rec(index+2,nums,l,sublist,maxcash);
        sublist.remove(sublist.size()-1);
        rec(index+1,nums,l,sublist,maxcash);

    }
    public int rob(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        Set<Integer> maxcash = new HashSet<>();
        rec(0,nums,l,sublist,maxcash);
        System.out.println(maxcash);
        int u = 0;
        for(Integer i:maxcash)
        {
            u = Math.max(u,i);
        }
        return u;
    }
}

import java.util.*;
class Solution {
    public void rec(int index,int[] candidates,int target,List<List<Integer>> l,List<Integer> sublist)
    {
        if(index == candidates.length)
        {
            if(target == 0)
            {
                int temp = 0;
                int[] arr = new int[sublist.size()];
                for(Integer i:sublist)
                {
                    arr[temp++] = i;
                }
                Arrays.sort(arr);
                List<Integer> ds = new ArrayList<>();
                for(int i=0;i<arr.length;i++)
                {
                    ds.add(arr[i]);
                }
                if(!l.contains(ds))
                {
                    l.add(ds);
                }
            }
            return;
        }
        if(target>=candidates[index])
        {
            sublist.add(candidates[index]);
            rec(index+1,candidates,target-candidates[index],l,sublist);
            sublist.remove(sublist.size()-1);

        }
        rec(index+1,candidates,target,l,sublist);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        rec(0,candidates,target,l,sublist);
        return l;
    }
}

class Solution {
    public void rec(int[] candidates,int target,int index,List<Integer> sublist,List<List<Integer>> l)
    {
        if(index == candidates.length)
        {
            if(target == 0)
            {
                List<Integer> ds = new ArrayList<>();
                for(Integer i:sublist)
                {

                    ds.add(i);
                }
                l.add(ds);
            }
            return;

        }
        if(target>=candidates[index])
        {
            sublist.add(candidates[index]);
            rec(candidates,target-candidates[index],index,sublist,l);
            sublist.remove(sublist.size()-1);
        }
        rec(candidates,target,index+1,sublist,l);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> sublist = new ArrayList<>();
        rec(candidates,target,0,sublist,l);
        return l;
    }
}

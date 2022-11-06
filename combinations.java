class Solution {
    public void rec(int[] arr,int index,int target,List<List<Integer>> l,List<Integer> sublist)
    {
        if(index>=arr.length)
        {
            if(sublist.size()==target)
            {
                List<Integer> o = new ArrayList<>();
                for(int i:sublist)
                {
                    o.add(i);
                }
                l.add(o);
            }
        }
        else
        {
            sublist.add(arr[index]);
            rec(arr,index+1,target,l,sublist);
            sublist.remove(sublist.size()-1);
            rec(arr,index+1,target,l,sublist);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
     int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = i+1;
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        rec(arr,0,k,l,s);
        return l;
    }
}

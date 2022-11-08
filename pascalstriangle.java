class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> fin = new ArrayList<>();
            for(int i=0;i<numRows;i++)
            {
                int p = i+1;
                if(p==1)
                {
                    List<Integer> l = new ArrayList<>();
                    l.add(1);
                    fin.add(l);
                }
                else if(p==2)
                {
                    List<Integer> l = new ArrayList<>();
                    l.add(1);
                    l.add(1);
                    fin.add(l);
                }
                else
                {
                    List<Integer> a = fin.get(p-2);
                    int[] arr = new int[p];
                    arr[0] = 1;
                    arr[p-1] = 1;
                    for(int j=0;j<p;j++)
                    {
                        if(arr[j] != 1)
                        {
                            arr[j] = 0;
                        }
                    }
                    for(int j=0;j<p;j++)
                    {
                        if(arr[j] == 0)
                        {
                            int res = a.get(j-1)+a.get(j);
                            arr[j] = res;
                        }
                    }
                    List<Integer> l = new ArrayList<>();
                    for(int j=0;j<p;j++)
                    {
                        l.add(arr[j]);
                    }
                    fin.add(l);
                }

            }
        return fin;
    }
}

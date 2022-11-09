class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int low = 0;
        int high = g.length-1;
        while(low<=high)
        {
            int temp = g[high];
            g[high] = g[low];
            g[low] = temp;
            low++;
            high--;
        }
        low = 0;
        high = s.length-1;
        while(low<=high)
        {
            int temp = s[high];
            s[high] = s[low];
            s[low] = temp;
            low++;
            high--;
        }
        int a = 0;
        int b = 0;
        int r = 0;
        while(a<g.length && b<s.length)
        {
            if(g[a]>s[b])
            {
                a++;
            }
            else
            {
                a++;
                b++;
                r++;
            }
        }
        return r;
    }

}

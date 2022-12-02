class Solution {
    public int count = 0;
    public void backtrack(int r,int c,int m,int n)
    {
        if(r == m-1 && c == n-1)
        {
            count++;
            return;
        }
        if(c<n)
        {
            backtrack(r,c+1,m,n);
        }
        if(r<m)
        {
            backtrack(r+1,c,m,n);
        }
    }
    public int uniquePaths(int m, int n) {
        backtrack(0,0,m,n);
        return count;
    }
}

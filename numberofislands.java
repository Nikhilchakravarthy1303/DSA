
class Solution {
    // Function to find the number of islands.

    public void dfs(int vi[][],char g[][],int i,int j,int n,int m)
    {
        if(i<0 || i>=n || j<0 || j>=m || g[i][j]=='0' || vi[i][j]==1)
        return;
        vi[i][j]=1;
        dfs(vi,g,i+1,j,n,m);
         dfs(vi,g,i-1,j,n,m);
          dfs(vi,g,i,j+1,n,m);
           dfs(vi,g,i,j-1,n,m);
            dfs(vi,g,i+1,j+1,n,m);
             dfs(vi,g,i+1,j-1,n,m);
              dfs(vi,g,i-1,j+1,n,m);
               dfs(vi,g,i-1,j-1,n,m);
    }





    public int numIslands(char[][] g) {
        // Code here
        int n=g.length;
        int m=g[0].length;
      int vi[][]=new int[n][m];
      int c=0;
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
              if(vi[i][j]==0 && g[i][j]=='1')
              {
                  c++;
                  dfs(vi,g,i,j,n,m);
              }
          }
      }
      return c;
    }
}  

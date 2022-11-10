
// User function Template for Java

class Point{
    int x,y,dist;
    Point(int x, int y, int dist){
        this.x = x;
        this.y = y;
        this.dist = dist;
    }
}
class Solution {

    int shortestPath(int[][] grid, int[] s, int[] d) {

        // Your code here
        int [] r = new int[] {-1,0,1,0};
        int [] c = new int[] {0,1,0,-1};
        int sx = s[0];
        int sy = s[1];
        int dx = d[0];
        int dy = d[1];
        Queue<Point> q = new LinkedList<Point>();
        grid[sx][sy] = 0;
        q.add(new Point(sx,sy,0));
        while(!q.isEmpty()){
            Point cur = q.remove();
            //System.out.println("current "+cur.x + " " + cur.y);
            if(cur.x == dx && cur.y == dy) return cur.dist;
            for(int i = 0; i < 4; i++){
                int nx = cur.x + r[i];
                int ny = cur.y + c[i];
                if(isSafe(grid,nx,ny) && grid[nx][ny]==1){
                    //System.out.println(nx + " " + ny);
                    q.add(new Point(nx,ny,cur.dist+1));
                    grid[nx][ny]=0;
                }
            }

        }
        return -1;

    }
    boolean isSafe(int[][] grid, int x, int y){
        int m = grid.length;
        int n = grid[0].length;
        if(x < m && x>=0 && y < n && y>=0) return true;
        return false;
    }
}

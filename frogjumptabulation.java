import java.util.* ;
import java.io.*;
public class Solution {
    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[heights.length];
        dp[0] = 0;
        for(int i=1;i<dp.length;i++)
        {
            int l = dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            int r = Integer.MAX_VALUE;
            if(i>1)
            {
                r = dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            }
            dp[i] = Math.min(l,r);
        }
        return dp[n-1];
    }

}

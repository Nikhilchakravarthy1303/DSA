import java.util.*;

class Main
{
    public static int rec(int n,int[] arr)
    {
        if(n==0)
        {
            return n;
        }
        int l = rec(n-1,arr)+Math.abs(arr[n]-arr[n-1]);
        int r = Integer.MAX_VALUE;
        if(n>1)
        {
            r = rec(n-2,arr)+Math.abs(arr[n]-arr[n-2]);
        }
        return Math.min(l,r);
    }
    public static void main (String[] args) {
        int[] arr = {10,20,30,10};
        System.out.println(rec(3,arr));
    }
}

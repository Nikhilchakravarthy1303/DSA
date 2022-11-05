/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class setzeromatrix
{
    public static int[][] setzero(int[][] n)
    {
        boolean[] r = new boolean[n.length];
        boolean[] c = new boolean[n[0].length];
        for(int i=0;i<n.length;i++)
        {
            for(int j=0;j<n[0].length;j++)
            {
                if(n[i][j] == 0)
                {
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
        for(int i=0;i<r.length;i++)
        {
            if(r[i] == true)
            {
                for(int j = 0;j<n[0].length;j++)
                {
                    n[i][j] = 0;
                }
            }

        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i] == true)
            {
                for(int j = 0;j<n.length;j++)
                {
                    n[j][i] = 0;
                }
            }
        }
        return n;
    }
	public static void main(String[] args) {
	    int[][] n = {{1,1,1},{1,0,1},{1,1,1}};
	    setzero(n);
	    for(int i=0;i<n.length;i++)
	    {
	        for(int j=0;j<n[0].length;j++)
	        {
	            System.out.print(n[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}

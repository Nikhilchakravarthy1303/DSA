/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class rotatematrix
{
    public static void rotate(int[][] p)
    {
        int[][] f = new int[p.length][p[0].length];
        int row = p.length-1;
        int col = 0;
        for(int i=0;i<p.length;i++)
        {
            row = p.length-1;
            for(int j=0;j<p[0].length;j++)
            {
                f[i][j] = p[row][col];
                row--;
            }
            col++;
        }
        p = f;
        for(int i=0;i<p.length;i++)
        {
        for(int j=0;j<p[0].length;j++)
        {
            System.out.print(p[i][j]+" ");
        }
        System.out.println();
        }
    }
	public static void main(String[] args) {
    int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
    rotate(a);
	}
}

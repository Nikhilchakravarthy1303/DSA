/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;


public class diagnoltraversal
{
    public static List<List<Integer>> diagnol(int[][] n)
    {
        List<List<Integer>> res = new ArrayList<>();
        int row = n.length;
        int col = n[0].length;
        int x = 0;
        for(int i=0;i<col;i++)
        {
            x=0;
            List<Integer> l = new ArrayList<>();
            int y=i;
            while(x<=i)
            {
                l.add(n[x][y--]);
                x++;
            }
            res.add(l);
        }
        x = row-1;
        for(int i=0;i<col;i++)
        {
            List<Integer> l = new ArrayList<>();
            x = row-1;
            int y = i;
            while(y<col)
            {
                l.add(n[x][y]);
                x--;
                y++;
            }
            res.add(l);
        }
        return res;
    }
	public static void main(String[] args) {
	    int[][] n = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		System.out.println(diagnol(n));
	}
}

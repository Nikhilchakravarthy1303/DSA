/*
A professional thief entered into a floor in a building,
The floor has M*N inter connected rooms, the thief can enter into any room
from any other room. And there are few rooms closed from inside, so the thief
cannot enter into them. Initially the thief is at room[0][0] and has to exit
from room[m-1][n-1].

You will be given the array room[][], filled with either 0 or 1.
Here, 1-indiactes a closed room, 0-indiactes a open room.
Your task is to find and print the number of unique escape routes
from room[0][0] and room[m-1][n-1]. And the thief can move only in
two directions one is forward direction and other is downward direction.


Input Format:
-------------
Line-1: Two space separated integers, M and N.
Next M lines: N space separated integers, either 0 or 1.

Output Format:
--------------
Print an integer result.

Sample Input-1:
---------------
3 4
0 0 0 0
0 1 0 0
0 0 1 0

Sample Output-1:
----------------
2


Sample Input-2:
---------------
4 4
0 0 0 0
0 0 1 0
1 0 0 0
0 0 1 0

Sample Output-2:
----------------
3
*/
import java.util.*;
class day4prog4{
  public static int count = 0;
  public static void backtrack(int[][] arr,int row,int col,int m,int n)
  {
    if(row == m-1 && col == n-1)
    {
      count++;
      return;
    }
    if(row<m-1)
    {
      if(arr[row+1][col] != 1)
      {
        backtrack(arr,row+1,col,m,n);
      }
    }
    if(col<n-1)
    {
      if(arr[row][col+1] != 1)
      {
        backtrack(arr,row,col+1,m,n);
      }
    }
  }
  public static void tnp(int[][] arr)
  {
    if(arr[0][0] == 1)
    {
      count = 0;
      return;
    }
    backtrack(arr,0,0,arr.length,arr[0].length);
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int col = sc.nextInt();
    int[][] arr = new int[row][col];
    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        arr[i][j] = sc.nextInt();
      }
    }
    tnp(arr);
    System.out.println(count);
  }
}

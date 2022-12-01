// /*
// In Turkey, an ice cream parlour gives an offer to a lucky kid.
// The parlour keeps N ice cream cups in a row, and there are different flavours
// of icecreams, where i-th cup filled with the flavour[i] type of ice cream.
//
// The kid can pick the continuous set of ice cream cups, where the cups are filled
// with icecreams of utmost two different flavours. The kid wants to
// pick the maximum number of ice cream cups from the row.
//
// You will be given the integer array, flavours[] of size N.
// Your task is to help the kid to pick the maximum number of ice cream cups
// with at most two different flavours.
//
//
// Input Format:
// -------------
// Line-1: An integer, number of icecreams.
// Line-2: N space separated integers, flavours[]
//
// Output Format:
// --------------
// Print an integer result, maximum number of icecream cups can be picked.
//
//
// Sample Input-1:
// ---------------
// 10
// 1 2 3 1 1 3 3 2 3 2
//
// Sample Output-1:
// ----------------
// 5
//
// Explanation:
// ------------
// The kid can pick the continuous set of icecream cups as follows: 3 1 1 3 3
// Where the cups are filled with two different flavours, 1 and 3.
//
//
//
// Sample Input-2:
// ---------------
// 10
// 2 1 1 3 2 1 3 0 0 3
//
// Sample Output-2:
// ----------------
// 4

import java.util.*;
class day3prog4{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] f = new int[n];
    for(int i=0;i<n;i++)
    {
      f[i] = sc.nextInt();
    }
    int i = 0;
    int j = 0;
    int count = 0;
    int max = Integer.MIN_VALUE;
    Set<Integer> s = new HashSet<>();
    while(i<f.length && j<f.length)
    {
      s.add(f[j]);
      if(s.size()<=2)
      {
        count++;
        max = Math.max(count,max);
        j++;
      }
      else
      {

        max = Math.max(max,count);
        count = 0;
        s = new HashSet<>();
        j = i+1;
        i++;
      }
    }
    System.out.println(max);
  }
}

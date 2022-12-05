import java.util.*;
class slidingwindowatmost{

  public static int sw(int[] arr)
  {
    int count = 0;
    Set<Integer> s = new HashSet<>();
    int max = Integer.MIN_VALUE;
    int i=0;
    int j=0;
    while(i<arr.length && j<arr.length)
    {
      s.add(arr[i]);
      if(s.size()<=2)
      {
        s.add(arr[j]);
        j++;
        count++;
        max = Math.max(count,max);
      }
      else
      {
        max = Math.max(count,max);
        i++;
        j = i;
        count= 0;
        s = new HashSet<>();
      }
    }
    return count;
  }


  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println(sw(arr));
  }
}

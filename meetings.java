//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                end[i] = Integer.parseInt(inputLine[i]);

            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class meeting{
    int start;
    int end;
    meeting(int s,int e)
    {
        start = s;
        end = e;
    }
}
class sort implements Comparator<meeting>
{
    public int compare(meeting m1,meeting m2)
    {
        return m2.end-m1.end;
    }
}
class Solution
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        if(start.length != end.length)
        {
            return 0;
        }
        meeting[] arr = new meeting[n];
        for(int i = 0;i<n;i++)
        {
            arr[i] = new meeting(start[i],end[i]);
        }
        Arrays.sort(arr,new sort());
        int mnm = 0;
        int e = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(start[i]>e)
            {
                mnm++;
                e = end[i];
            }
            
        }
        return mnm;


    }
}

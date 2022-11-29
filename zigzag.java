class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
        {
            return s;
        }
        StringBuilder[] arr = new StringBuilder[numRows];
        String res = "";
        for(int i=0;i<numRows;i++)
        {
            arr[i] = new StringBuilder();
        }
        int row = 0;
        int dir = 0;
        for(int i=0;i<s.length();i++)
        {
            row += dir;
            arr[row].append(s.charAt(i));
            if(row == 0)
            {
                dir = 1;
            }
            if(row == numRows-1)
            {
                dir = -dir;
            }
        }
        for(StringBuilder sb:arr)
        {
            res += sb.toString();
        }
        return res;
    }
}

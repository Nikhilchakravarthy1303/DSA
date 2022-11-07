class Solution {
    public boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        int t = 0;
        for(int i=s.length()-1;i>0;i--)
        {
            if(sb.charAt(i) == s.charAt(t) )
            {
                t++;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String res = "";
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            for(int j = i+1;j<s.length()+1;j++)
            {
                if(isPalindrome(s.substring(i,j)) && s.substring(i,j).length()>max)
                {
                    System.out.println(s.substring(i,j));
                    max = s.substring(i,j).length();
                    res = s.substring(i,j);
                }
            }
        }
            return res;
    }
}

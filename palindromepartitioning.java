class Solution {
    public boolean isPal(String s)
    {
        String temp = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            temp += String.valueOf(s.charAt(i));
        }
        int j = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != temp.charAt(j++))
            {
                return false;
            }
        }
        return true;
    }
    public void rec(String s,int index,List<List<String>> l,List<String> sublist)
    {
        if (index == s.length()) {
            l.add(new ArrayList < > (sublist));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if (isPal(s.substring(index,i))) {
                sublist.add(s.substring(index, i + 1));
                rec(s,i+1,l,sublist);
                sublist.remove(sublist.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> l = new ArrayList<>();
        List<String> sublist = new ArrayList<>();
        rec(s,0,l,sublist);
        return l;
    }
}

class Solution {
    public boolean backspaceCompare(String s, String t) {
        String a = "";
        String b = "";
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != '#')
            {
                st.push(String.valueOf(s.charAt(i)));
            }
            else
            {
                if(st.isEmpty())
                {
                    continue;
                }
                st.pop();
            }
        }
        while(!st.isEmpty())
        {
            a += st.pop();
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i) != '#')
            {
                st.push(String.valueOf(t.charAt(i)));
            }
            else
            {
                if(st.isEmpty())
                {
                    continue;
                }
                st.pop();
            }
        }
        while(!st.isEmpty())
        {
            b += st.pop();
        }
        System.out.println(a+" "+b);
        return a.equals(b);
    }
}

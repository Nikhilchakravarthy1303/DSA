class Solution {
    public String say(String s)
    {
        if(s.length() == 1)
        {
            String re = "";
            re += 1;
            re += s;
            return re;
        }
        String res = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.empty())
            {
                st.push(s.charAt(i));
            }
            else
            {
                if(st.peek() == s.charAt(i))
                {
                    st.push(s.charAt(i));
                }
                else
                {
                    res += st.size();
                    res += st.peek();
                    while(!st.empty())
                    {
                        st.pop();
                    }
                    st.push(s.charAt(i));
                }
            }
        }
        if(!st.empty())
        {
            res+=st.size();
            res+=st.peek();
            while(!st.empty())
            {
                st.pop();
            }
        }
        System.out.println(res);
        return res;
    }
    public String countAndSay(int n) {
        if(n == 1)
        {
            return "1";
        }
        return say(countAndSay(n-1));
    }
}

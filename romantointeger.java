class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m = new HashMap<>();
        int res = 0;
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
                res+=m.get(s.charAt(i));

            }
            else{
                if(s.charAt(i) == 'M' || s.charAt(i) == 'D')
                {
                    if(st.peek() == 'C')
                    {
                        System.out.println(m.get(s.charAt(i))-(2*m.get('C')));
                        res+=m.get(s.charAt(i))-(2*m.get('C'));
                    }
                    else
                    {
                        System.out.println(m.get(s.charAt(i)));
                                        res+=m.get(s.charAt(i));

                    }

                }
                if(s.charAt(i) == 'L' || s.charAt(i) == 'C')
                {
                    if(st.peek() == 'X')
                    {
                        System.out.println(m.get(s.charAt(i))-(2*m.get('X')));
                        res+=m.get(s.charAt(i))-(2*m.get('X'));
                    }
                    else
                    {                res+=m.get(s.charAt(i));

                        System.out.println(m.get(s.charAt(i)));
                    }

                }
                if(s.charAt(i) == 'V' || s.charAt(i) == 'X')
                {
                    if(st.peek() == 'I')
                    {
                        System.out.println(m.get(s.charAt(i))-(2*m.get('I')));
                        res+=m.get(s.charAt(i))-(2*m.get('I'));
                    }
                    else
                    {                res+=m.get(s.charAt(i));

                        System.out.println(m.get(s.charAt(i)));
                    }
                }
                if(s.charAt(i)=='I')
                {
                    System.out.println(m.get(s.charAt(i)));
                    res+=m.get(s.charAt(i));

                }
                st.push(s.charAt(i));

            }
            System.out.println(st);
        }
        return res;
    }
}

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        HashMap<Character,String> h = new HashMap<>();
        if(pattern.length()!=arr.length)
        {
            return false;
        }
            for(int i=0;i<pattern.length();i++)
            {
                if(!h.containsKey(pattern.charAt(i)))
                {
                    if(h.containsValue(arr[i]))
                    {
                        return false;
                    }
                    else
                    {
                        h.put(pattern.charAt(i),arr[i]);
                    }
                }
                else
                {
                    if(!h.get(pattern.charAt(i)).equals(arr[i]))
                    {
                        return false;
                    }
                }
            }

        return true;
    }
}

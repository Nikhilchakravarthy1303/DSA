import java.util.*;

class Solution {

    public int lengthOfLongestSubstring(String a) {
        String temp = "";
        int maxlength = 0;
        for(char i:a.toCharArray())
        {
            String current = String.valueOf(i);
            if(temp.contains(current))
            {
                temp = temp.substring(temp.indexOf(current)+1);
            }
            temp += current;
            maxlength = Math.max(maxlength,temp.length());
        }
        return maxlength;
    }
}

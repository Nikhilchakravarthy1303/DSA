class Solution {
    public boolean rotateString(String s, String goal) {
        int index = s.indexOf(goal.charAt(0));
        String res = "";
        res += s.substring(index);
        res += s.substring(0,index);
        return res.equals(goal);
    }
}

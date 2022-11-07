class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int carry = 0;
        while(b.length()<a.length())
        {
            b = "0"+b;
        }
        while(a.length()<b.length())
        {
            a = "0"+a;
        }
        for(int i=a.length()-1;i>=0;i--)
        {
            int sum = carry;
            sum+=a.charAt(i)-'0';
            sum+=b.charAt(i)-'0';
            res = sum%2 +res;
            carry = sum/2;
        }
        if(carry != 0)
        {
            res = "1"+res;
        }
        StringBuilder sb = new StringBuilder(res);
        return sb.toString();
    }
}

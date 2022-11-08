
class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0)
		    return "";
        String[] arr = new String[nums.length];
        Comparator<String> com = new Comparator<String>(){
            @Override
            public int compare(String a,String b)
            {
                return (b+a).compareTo(a+b);
            }
        };
        int temp = 0;
        for(int i:nums)
        {
            arr[temp++] = String.valueOf(i);
        }
        String res = "";
        Arrays.sort(arr,com);
        for(String s:arr)
        {
            res += s;
        }
        if(arr[0].charAt(0) == '0')
			return "0";
        return res;
    }
}

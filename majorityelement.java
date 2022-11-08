class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums)
        {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Integer i:m.keySet())
        {
            if(m.get(i) >= (nums.length+1)/2)
            {
                return i;
            }
        }
        return -1;
    }
}

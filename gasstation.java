class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gast = 0;
        int costt = 0;
        for(int i=0;i<gas.length;i++)
        {
            gast += gas[i];
            costt += cost[i];
        }
        if(gast<costt)
        {
            return -1;
        }
        int fuel = 0;
        int start = 0;
        for(int i=0;i<gas.length;i++)
        {
            fuel += gas[i]-cost[i];
            if(fuel<0)
            {
                fuel = 0;
                start = i+1;
            }
        }
        return start;
    }
}

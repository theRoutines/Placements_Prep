//FIRST ATTEMPT YOU ACHIEVED

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i: nums)
        {
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int result = 0;
        for(Integer i : map.keySet())
        {
            if(map.get(i) > n/2.0)
            {
                result = i;
                continue;
            }
        }
        return result;
    }
}
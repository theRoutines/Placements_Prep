class Solution {
    public int countPartitions(int[] nums) {
        int diff = 0;
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            sum1 += nums[i];
            sum2 = 0;
            for(int j=i+1;j<nums.length;j++)
            {
                sum2 = sum2+nums[j];
            }
            if((sum1-sum2)%2==0)
            {
                count++;
            }
        }
        return count;

    }
}

// optimized 
class Solution {
    public int countPartitions(int[] nums) {
        long sum = 0;                // use long to avoid overflow for large values
        for (int x : nums) {
            sum += x;
        }
        // If total sum is even → all n-1 splits valid, else 0
        return (sum % 2 == 0) ? (nums.length - 1) : 0;
    }
}

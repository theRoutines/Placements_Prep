class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int c = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[k++] = nums[i];
            }
            else
            {
                c++;
            }
        }
        for(int i=1;i<=c;i++)
        {
            nums[k++] =  0;
        }
        System.out.print(Arrays.toString(nums));
        
    }
}
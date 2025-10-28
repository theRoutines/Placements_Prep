// LEARNING - I LEARNT THAT WHEN WE INCREASE ARRAY SIZE, IT BY DEFAULT SAVES ALL INDEXES TO 0
// MY APPROACH - I CONVERTED ALL ELEMENTS TO ARRAYLIST AND THEN TRIED TO CONVERT INTO ARRAY
// OPTIMIZED APPROACH - START FROM BEHIND, BECAUSE IN THAT WAY, AFTER PROCESSING THE LAST ELEMENT, WE RETURN THE ARRAY. 

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i>=0; i--)
        {
            if(digits[i]<9)
            {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int res[] = new int[n+1];
        res[0] = 1;
        return res;
    }
}
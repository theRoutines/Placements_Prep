class Solution {
    public int reversed(int number)
    {
        int reversed_number = 0;
        while(number>0)
        {
            int p = number%10;
            reversed_number = reversed_number*10 + p;
            number = number/10;
        }
        return reversed_number;
    }
    public boolean isSameAfterReversals(int num) {
        int result1 = reversed(num);
        int result2 = reversed(result1);
        if(num==result2){
            return true;
        }
        else{
            return false;
        }
    }
}
